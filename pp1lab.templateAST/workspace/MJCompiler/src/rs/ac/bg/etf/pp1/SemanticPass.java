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
	boolean isVoid = false;
	private boolean returnExists = false;
	boolean errorDetected = false;
	int nVars;
	
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
	
	
	
	public void visit(VarDeclClass varDecl) {
		varDeclCount++;
		report_info("Deklarisana promenljiva " + varDecl.getVarName(), varDecl);
		Obj varNode = Tab.insert(Obj.Var, varDecl.getVarName(), varDecl.getType().struct);
		
	}
	
	 //ako je pozvan print iz programa
	public void visit(PrintClass PrintStmt) {
		printCallCount++;
		//log.info("Prepoznata naredba print!");
	}
	
	// za program
	public void visit(ProgNameClass progName) {
		progName.obj = Tab.insert(Obj.Prog, progName.getProgName(), Tab.noType);
		Tab.openScope();
	}
	
	public void visit(ProgramClass program) {
		nVars = Tab.currentScope.getnVars();
		Tab.chainLocalSymbols(program.getProgName().obj);
		Tab.closeScope();
	}
	//***************
	
	// za tip
	public void visit(TypeClass type) {
		Obj typeNode = Tab.find(type.getTypeName());
		if (typeNode == Tab.noObj) {
			report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola! ", null);
		}
		else {
			if (Obj.Type == typeNode.getKind()) {
				type.struct = typeNode.getType();
			}
			else {
				report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip!", type);
				type.struct = Tab.noType;
			}
		}
	}
	//***************
	
	// za metode
	public void visit(ReturnTypeClass returnType) {
		Struct t = returnType.getType().struct; 
		isVoid = (t == Tab.noType );
		returnType.obj = Tab.insert( Obj.Meth, returnType.getMethName(), t);
		currentMethod = returnType.obj;
        Tab.openScope(); 
        report_info("Obradjuje se funkcija " + returnType.getMethName(), returnType);
	}

	public void visit(VoidRetTypeClass voidRetType) {
		isVoid=true; 
		voidRetType.obj = Tab.insert( Obj.Meth, voidRetType.getMethName(), Tab.noType); 
		currentMethod = voidRetType.obj;
		Tab.openScope();
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
        Tab.chainLocalSymbols(currentMethod);
        Tab.closeScope();
        
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
	public void visit(DesignatorClass designator) {
		Obj obj = Tab.find(designator.getDesigName());
		if (obj == Tab.noObj) {
			report_error("Greska u liniji "+designator.getLine()+" : ime " + designator.getDesigName() + " nije deklarisano!", designator);
		}
		
		designator.obj = obj;
	}
	
	
	public void visit(FunCallClass funcCall) {
		Obj func = funcCall.getDesignator().obj;
		if (Obj.Meth == func.getKind()) {
			report_error("Pronadjen poziv funkcije "+funcCall.getLine()+" : ime " + funcCall.getDesignator() + " nije funkcija!", funcCall);
			funcCall.struct = func.getType();
		}
		else {
			report_error("Greska u liniji "+funcCall.getLine()+" : ime " + func.getName() + " nije funkcija!", funcCall);
			funcCall.struct = Tab.noType;
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
		if (te.equals(t) && te == Tab.intType) {
			addExpr.struct = te;
		}
		else {
			report_error("Greska u liniji "+addExpr.getLine()+" : nekompatibilni tipovi u izarzu za sabiranje.", null);
		}
		
	}
	
	//nisam izgenerisao za BooleanClass
	
	public void visit(LetterClass letter) {
		letter.struct = Tab.charType;
	}
	
	public void visit(NumberClass number) {
		number.struct = Tab.intType;
	}
	
	public void visit(VarClass var) {
		var.struct = var.getDesignator().obj.getType();
	}
	
	public void visit(ExprFactorClass exprFactor) {
		exprFactor.struct = exprFactor.getExpr().struct;
	}
	
	public void visit(AssignOperatorClass assignment) {
		if (!assignment.getExpr().struct.assignableTo(assignment.getDesignator().obj.getType())) {
			report_error("Greska na liniji " + assignment.getLine() + " : nekompatiblni tipovi u dodeli vrednosti" , null);
		}
	}
	
	public boolean passed() {
		return !errorDetected;
	}
	
//	public void visit(MethodTypeNameClass methodTypeName) {
//		//currentMethod = Tab.insert(Obj.Meth, methodTypeName.getMethName(), methodTypeName.getTypeList().struct);
//	}
}
