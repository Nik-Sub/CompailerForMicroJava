package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.*;
import rs.etf.pp1.symboltable.concepts.*;

public class SemanticPass extends VisitorAdaptor {
	Logger log = Logger.getLogger(getClass());
	int printCallCount = 0;
	int varDeclCount = 0;
	Obj currentMethod = null;
	Obj currentMethodInNamespace = null;
	boolean isVoid = false;
	private boolean returnExists = false;
	boolean errorDetected = false;
	int nVars;
	String namespaceName = "";
	
	// for var decl
	Struct typeOfVarDecl;
	// for const decl
	Struct typeOfValueForConst;
	int valueForConst;
	String namespacePrefix;
	
	// za greske
	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		//errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	
	// Namespace
	public void visit(NamespaceNameClass namespace) {
		report_info("Postavljen namespace: " + namespace.getName(), null);
		namespaceName = namespace.getName();
	}
	
	public void visit(EndOfNamespace endOfNamespace) {
		report_info("Resetovan namespaceName", null);
		namespaceName = new String("");
		//report_info("Novi namespace: " + namespaceName, null);
	}
	
	
	
	// ConstDecl
	public void visit(CharConstTypeClass charType) {
		typeOfValueForConst = nTab.find("char").getType();
		valueForConst = charType.getValue();
	}
	
	public void visit(NumConstTypeClass numberType) {
		typeOfValueForConst = nTab.find("int").getType();
		valueForConst = numberType.getValue();
		
	}
	
	
	public void visit(ConstInitClass constInit) {
		if (!typeOfValueForConst.assignableTo(typeOfVarDecl)) {
			report_error("Greska na liniji " + constInit.getLine() + " : nekompatiblni tipovi u dodeli vrednosti" , null);
		}
		report_info("Deklarisana konstanta " + namespaceName + "::" + constInit.getName(), constInit);
		Obj newObj = nTab.insert(Obj.Con, namespaceName + constInit.getName(), typeOfVarDecl);
		newObj.setAdr(valueForConst);
	}
	
	
	
	// VarDecl
	
	
	public void visit(VarNoArrayClass noArray) {
		varDeclCount++;
		report_info("Trenutni namespace: " + namespaceName, null);
		if (currentMethod == null) {
			report_info("Deklarisana promenljiva " + namespaceName + "::" + noArray.getName(), noArray);
			Obj varNode = nTab.insert(Obj.Var, namespaceName + noArray.getName(), typeOfVarDecl);
		}
		else {
			report_info("Deklarisana promenljiva " + noArray.getName(), noArray);
			Obj varNode = nTab.insert(Obj.Var, noArray.getName(), typeOfVarDecl);
		}
		
	}
	
	public void visit(VarArrayClass array) {
		varDeclCount++;
		report_info("Deklarisana promenljiva " + namespaceName + "::" + array.getName(), array);
		Struct arrS = new Struct(Struct.Array, typeOfVarDecl);
		Obj varNode = nTab.insert(Obj.Var, namespaceName + array.getName(), arrS);
		
	}
	
	// Parameters in methCall
	public void visit(ParNoArrayClass noArray) {
		varDeclCount++;
		report_info("Deklarisana promenljiva " + noArray.getName(), noArray);
		Obj varNode = nTab.insert(Obj.Var, noArray.getName(), typeOfVarDecl);
		
	}
	
	public void visit(ParArrayClass array) {
		varDeclCount++;
		Struct arrS = new Struct(Struct.Array, typeOfVarDecl);
		Obj varNode = nTab.insert(Obj.Var, array.getName(), arrS);
	}
	
	
	
	
	 //ako je pozvan print iz programa
	public void visit(PrintClass print) {
		printCallCount++;
		
		if (print.getExpr().struct != nTab.intType && print.getExpr().struct != nTab.charType && (print.getExpr().struct.getKind() == Struct.Array && print.getExpr().struct.getElemType().getKind() != Struct.Int && print.getExpr().struct.getElemType().getKind() != Struct.Char)) {
			report_error("Tip expr: " + print.getExpr().struct.getKind(), null);
			report_error("Tip u print: " + print.getExpr().struct.getElemType().getKind(), null);
			report_error("Semanticka greska na liniji " + print.getLine() + ": Operand instrukcije print mora biti int ili char!", null);
		}
		//log.info("Prepoznata naredba print!");
	}
	
	// za program
	public void visit(ProgNameClass progName) {
		progName.obj = nTab.insert(Obj.Prog, progName.getProgName(), nTab.noType);
		nTab.openScope();
	}
	
	public void visit(ProgramClass program) {
		nVars = nTab.currentScope.getnVars();
		nTab.chainLocalSymbols(program.getProgName().obj);
		nTab.closeScope();
	}
	//***************
	
	// za tip
	public void visit(TypeClass type) {
		Obj typeNode = nTab.find(type.getTypeName());
		if (typeNode == nTab.noObj) {
			report_error("Nije pronadjen tip " + type.getTypeName() + " u nTabeli simbola! ", null);
		}
		else {
			if (Obj.Type == typeNode.getKind()) {
				type.struct = typeNode.getType();
				typeOfVarDecl = type.struct;
			}
			else {
				report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip!", type);
				type.struct = nTab.noType;
			}
		}
	}
	
	//***************
	
	// za metode
	public void visit(ReturnTypeClass returnType) {
		Struct t = returnType.getType().struct; 
		isVoid = (t == nTab.noType );
		returnType.obj = nTab.insert( Obj.Meth, namespaceName + returnType.getMethName(), t);
		currentMethod = returnType.obj;
        nTab.openScope(); 
        report_info("Obradjuje se funkcija " + returnType.getMethName(), returnType);
	}

	public void visit(VoidRetTypeClass voidRetType) {
		isVoid=true; 
		voidRetType.obj = nTab.insert( Obj.Meth, namespaceName + voidRetType.getMethName(), nTab.noType); 
		currentMethod = voidRetType.obj;
		nTab.openScope();
		report_info("Obradjuje se funkcija " + voidRetType.getMethName(), voidRetType);
	}
	
	/*****************************************************************
	* Na kraju obrade metoda proveravamo da li se radi o metodu
	* koji nije void, a u njegovom telu nema return iskaza. 
	* Ako je to slucaj, prijavljuje se greska.
	*****************************************************************/ 
	public void visit(MethodDeclClass methodDec) {
		if (!isVoid && !returnExists) { 
			report_error("Greska u liniji "+methodDec.getLine()+": Metod mora imati return iskaz jer nije deklarisan sa void", methodDec);
		}
        returnExists=false;
		//Obj o = methodDec.getMethodTypeName().obj;
        //o.setLevel(0);
        nTab.chainLocalSymbols(currentMethod);
        nTab.closeScope();
        
        currentMethod = null;

	}
	
	/*****************************************************************
	* Pri prepoznavanju return iskaza postavljamo promenljivu 
	* returnExists. Ako metoda koja nije void ima prazan return 
	* iskaz, prijavljuje se greska. Ako void metoda ima return 
	* iskaz koji vraca vrednost, prijavljuje se greska.
	*****************************************************************/
	public void visit(ReturnNoExpressionClass returnNoExpr) { 
	    returnExists=true;
		if (!isVoid) {
			report_error("Greska u liniji "
                         +returnNoExpr.getLine()+": metod mora imati return iskaz sa izrazom jer nije deklarisan sa void", returnNoExpr);
		}
	}

	public void visit(ReturnClass ret) {
	    returnExists=true;
		if (isVoid) {
			report_error("Greska u liniji "+ret.getLine()+": metod ne sme imati return sa izrazom jer je deklarisan sa void", null);
		}
		Struct currMethType = currentMethod.getType();
		if (!currMethType.compatibleWith(ret.getExpr().struct)) {
			report_error("Greska u liniji "+ret.getLine()+": Tip izraza u return naredbi se ne slaze sa tipom povratne vrednosti funkcije.", null);
		}
	}
	//***************
	
	// designator
	// u sustini designator predstavlja promenljivu koja je vec deklarisana
	
	public void visit(DesignatorWithPrefixClass designatorWithPrefix) {
		Obj obj = nTab.find(designatorWithPrefix.getPrefix() + designatorWithPrefix.getDesigName());
		if (obj == nTab.noObj) {
			report_error("Greska u liniji "+designatorWithPrefix.getLine()+" : ime " +designatorWithPrefix.getPrefix() + "::" + designatorWithPrefix.getDesigName() + " nije deklarisano!", designatorWithPrefix);
		}
		
		designatorWithPrefix.obj = obj;
	}
	
	public void visit(DesignatorWithPrefixArrayClass desWithPref) {
		desWithPref.obj = desWithPref.getNameOfArrayWithPrefix().obj;
	}
	
	public void visit(NameOfArrayWithPrefixClass designatorWithPrefix) {
		Obj obj = nTab.find(designatorWithPrefix.getPrefix() + designatorWithPrefix.getDesigName());
		if (obj == nTab.noObj) {
			report_error("Greska u liniji "+designatorWithPrefix.getLine()+" : ime " +designatorWithPrefix.getPrefix() + "::" + designatorWithPrefix.getDesigName() + " nije deklarisano!", designatorWithPrefix);
		}
		
		designatorWithPrefix.obj = obj;
	}
	
	public void visit(DesignatorClass designator) {
		if (namespaceName != "") {
			Obj obj = nTab.find(designator.getDesigName());
			if (obj == nTab.noObj) {
				obj = nTab.find(namespaceName + designator.getDesigName());
				if (obj == nTab.noObj) {
					report_error("Greska u liniji "+designator.getLine()+" : ime " + designator.getDesigName() + " nije deklarisano!", designator);
				}
			}
			
			designator.obj = obj;
		}
		else {
			Obj obj = nTab.find(designator.getDesigName());
			if (obj == nTab.noObj) {
				report_error("Greska u liniji "+designator.getLine()+" : ime " + designator.getDesigName() + " nije deklarisano!", designator);
			}
			
			designator.obj = obj;
		}
	}
	
	public void visit(NameOfArrayClass designator) {
		if (namespaceName != "") {
			Obj obj = nTab.find(designator.getDesigName());
			if (obj == nTab.noObj) {
				obj = nTab.find(namespaceName + designator.getDesigName());
				if (obj == nTab.noObj) {
					report_error("Greska u liniji "+designator.getLine()+" : ime " + designator.getDesigName() + " nije deklarisano!", designator);
				}
			}
			
			designator.obj = obj;
		}
		else {
			Obj obj = nTab.find(designator.getDesigName());
			if (obj == nTab.noObj) {
				report_error("Greska u liniji "+designator.getLine()+" : ime " + designator.getDesigName() + " nije deklarisano!", designator);
			}
			
			designator.obj = obj;
		}
	}
	
	public void visit(DesignatorArrayClass designator) {
		designator.obj = designator.getNameOfArray().obj;
	}
	
	
	public void visit(FunCallClass funcCall) {
		Obj funcDes = funcCall.getDesignator().obj;
		Obj func = nTab.find(funcDes.getName());
		if (Obj.Meth == func.getKind()) {
			//report_error("Tip " + func.getKind(), null);
			if (nTab.noType == func.getType()) {
				report_error("Semanticka greska " + func.getName() + " ne moze se koristiti u izrazima jer nema povratnu vrednost ", funcCall);
			}
			else {
				report_info("Pronadjen poziv funkcije "+funcCall.getLine()+" : ime " + func.getName(), null);
				funcCall.struct = func.getType();
			}
		}
		else {
			report_error("Greska u liniji "+funcCall.getLine()+" : ime " + func.getName() + " nije funkcija!", funcCall);
			funcCall.struct = nTab.noType;
		}
	}
	
	
	public void visit(TermClass term) {
		term.struct = term.getFactor().struct;
		
	}
	
	public void visit(ExprClass expr) {
		expr.struct = expr.getTerm().struct;
		
	}
	
	public void visit(AddExprClass addExpr) {
		Struct te = addExpr.getExpr().struct;
		Struct t = addExpr.getTerm().struct;
		if (te.equals(t) && te == nTab.intType ||te.getKind() == Struct.Int && t.getKind() == Struct.Array && t.getElemType().getKind() == Struct.Int) {
			addExpr.struct = te;
		}
		else {
			report_error("te : " + te.getKind() + " t: " + t.getKind(), null);
			report_error("Greska u liniji "+addExpr.getLine()+" : nekompatibilni tipovi u izarzu za sabiranje.", null);
		}
		
	}
	
	// Factor
	
	public void visit(NewTypeClass newTypeClass) {
		Struct arrS = new Struct(Struct.Array, newTypeClass.getType().struct);
		newTypeClass.struct = arrS;
	}
	
	
	public void visit(LetterClass letter) {
		letter.struct = nTab.charType;
	}
	
	public void visit(NumberClass number) {
		number.struct = nTab.intType;
	}
	
	public void visit(VarClass var) {
		var.struct = var.getDesignator().obj.getType();
	}
	
	public void visit(ExprFactorClass exprFactor) {
		exprFactor.struct = exprFactor.getExpr().struct;
	}
	
	public void visit(BoolConstTypeClass bool) {
		bool.struct = nTab.find("bool").getType();
	}
	
	public void visit(TrueClass trueClass) {
		trueClass.struct = nTab.find("bool").getType();
	}
	
	public void visit(FalseClass falseClass) {
		falseClass.struct = nTab.find("bool").getType();
	}
	
	public void visit(BoolConstClass boolOvr) {
		boolOvr.struct = nTab.find("bool").getType();
	}
	
	//*******************
	
	//for index of arrays
	public void visit(ExprListIdentClass exprForInd) {
//		if (exprForInd.getExpr().struct != nTab.find("int").getType()) {
//			report_error("Index mora biti int tipa veci ili jednak 0!", null);
//		}
	}
	
	
	public void visit(AssignOperatorClass assignment) {
		report_info("Usao u assignOperatorClass", null);
		if (!assignment.getExpr().struct.assignableTo(assignment.getDesignator().obj.getType()) && assignment.getExpr().struct.getKind() != Struct.Int && assignment.getExpr().struct.getKind() != Struct.Char && !(assignment.getExpr().struct.getKind() == Struct.Array && assignment.getExpr().struct.getElemType().getKind() == Struct.Int)) {
			report_error("Greska na liniji " + assignment.getLine() + " : nekompatiblni tipovi u dodeli vrednosti" , null);
		}
	}
	
	public boolean passed() {
		return !errorDetected;
	}
	

}
