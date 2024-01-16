package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.VisitorAdaptor;
import rs.etf.pp1.mj.runtime.Code;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.ac.bg.etf.pp1.CounterVisitor.FormParamCounter;
import rs.ac.bg.etf.pp1.CounterVisitor.VarCounter;
import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.concepts.*;

public class CodeGenerator extends VisitorAdaptor {
	
	private int mainPc;
	private boolean newOperator = false;
	private Obj indForArray = null;
	private boolean arrayWithIndexOnTheLeftSideOfEqual;
	
	public int getMainPc() {
		return mainPc;
	}
	
	public void visit(PrintClass printStmt) {
		if (printStmt.getExpr().struct == Tab.intType || printStmt.getExpr().struct.getKind() == Struct.Array && printStmt.getExpr().struct.getElemType().getKind() == Struct.Int) {
			Code.loadConst(5);
			Code.put(Code.print);
		}
		else {
			Code.loadConst(1);
			Code.put(Code.bprint);
		}
	}
	
	// constants are not in Table of symbols, we are pushing them on the stack directly
	
//	public void visit(BoolConstClass boolConst) {
//		Obj con = Tab.insert(Obj.Con, "$", boolConst.struct);
//		con.setLevel(0);
//		con.setAdr(Integer.parseInt(boolConst.getB1()));
//		
//		Code.load(con);
//	}
	
	
	public void visit(NumberClass number) {
		Obj con = Tab.insert(Obj.Con, "$", number.struct);
		con.setLevel(0);
		con.setAdr(number.getN1());
		indForArray = con;
		
		Code.load(con);
	}
	
	public void visit(LetterClass letter) {
		Obj con = Tab.insert(Obj.Con, "$", letter.struct);
		con.setLevel(0);
		con.setAdr(letter.getL1());
		
		Code.load(con);
	}
	//***************************
	
	// functions declaration
	public void visit(ReturnTypeClass methWithReturn) {
		
		if ("main".equalsIgnoreCase(methWithReturn.getMethName())) {
			mainPc = Code.pc;
		}
		methWithReturn.obj.setAdr(Code.pc);
		
		//Collect arguments and local variables
		SyntaxNode methodNode = methWithReturn.getParent();
		
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(fpCnt.getCount() + varCnt.getCount());
		
	}
	
	public void visit(VoidRetTypeClass methWithNoReturn) {
			
		if ("main".equalsIgnoreCase(methWithNoReturn.getMethName())) {
			mainPc = Code.pc;
		}
		methWithNoReturn.obj.setAdr(Code.pc);
		
		//Collect arguments and local variables
		SyntaxNode methodNode = methWithNoReturn.getParent();
		
		VarCounter varCnt = new VarCounter();
		methodNode.traverseTopDown(varCnt);
		
		FormParamCounter fpCnt = new FormParamCounter();
		methodNode.traverseTopDown(fpCnt);
		
		// Generate the entry
		Code.put(Code.enter);
		Code.put(fpCnt.getCount());
		Code.put(fpCnt.getCount() + varCnt.getCount());
	}
	
	public void visit(MethodDeclClass methodDecl) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	//***************************
	
	// we are getting value from the stack and store it to the obj
	public void visit(AssignOperatorClass assignment) {
		if (assignment.getDesignator().obj.getType().getKind() == Struct.Array && !newOperator) {
			Code.put(Code.astore);
		}
		else {
			newOperator = false;
			Code.store(assignment.getDesignator().obj);
		}
	}
	
	public void visit(DesignatorClass designator) {
		SyntaxNode parent = designator.getParent();
		
		// if we are using designator inside expression, we will put it on the stack
		if (AssignOperatorClass.class != parent.getClass() && FunCallClass.class != parent.getClass()) {
			// ... + niz[1] + ... situation
			if (arrayWithIndexOnTheLeftSideOfEqual) {
				arrayWithIndexOnTheLeftSideOfEqual = false;
				// pop index
				Code.put(Code.pop);
				// add adr of the array
				Code.load(designator.obj);
				// now add index
				Code.load(indForArray);
				Code.put(Code.aload);
			}
			else {
				indForArray = designator.obj;
				Code.load(designator.obj);
			}
			
		}
		// niz[ind] = ... - this situation
		else if (AssignOperatorClass.class == parent.getClass() && designator.obj.getType().getKind() == Struct.Array && arrayWithIndexOnTheLeftSideOfEqual) {
			arrayWithIndexOnTheLeftSideOfEqual = false;
			
			// pop index
			Code.put(Code.pop);
			// add adr of the array
			Code.load(designator.obj);
			// now add index
			Code.load(indForArray);
			
		}
		
	}
	
	public void visit(DesignatorWithPrefixClass desginatorFromNamespace) {
		SyntaxNode parent = desginatorFromNamespace.getParent();
		
		// if we are using designator inside expression, we will put it on the stack
		if (AssignOperatorClass.class != parent.getClass() && FunCallClass.class != parent.getClass()) {
			// ... + niz[1] + ... situation
			if (arrayWithIndexOnTheLeftSideOfEqual) {
				arrayWithIndexOnTheLeftSideOfEqual = false;
				// pop index
				Code.put(Code.pop);
				// add adr of the array
				Code.load(desginatorFromNamespace.obj);
				// now add index
				Code.load(indForArray);
				Code.put(Code.aload);
			}
			else {
				indForArray = desginatorFromNamespace.obj;
				Code.load(desginatorFromNamespace.obj);
			}
			
		}
		// niz[ind] = ... - this situation
		else if (AssignOperatorClass.class == parent.getClass() && desginatorFromNamespace.obj.getType().getKind() == Struct.Array && arrayWithIndexOnTheLeftSideOfEqual) {
			arrayWithIndexOnTheLeftSideOfEqual = false;
			
			// pop index
			Code.put(Code.pop);
			// add adr of the array
			Code.load(desginatorFromNamespace.obj);
			// now add index
			Code.load(indForArray);
			
		}
	}
	
	public void visit(IncClass incClass) {
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(1);
		
		Code.load(con);
		Code.put(Code.add);
		Code.store(incClass.getDesignator().obj);
	}
	
	public void visit(DecClass decClass) {
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(1);
		
		Code.load(con);
		Code.put(Code.sub);
		
		Code.store(decClass.getDesignator().obj);
	}
	
	
	public void visit(ExprListIdentClass sufixForArray) {
		arrayWithIndexOnTheLeftSideOfEqual = true;
	}
	//***************************
	
	// call of the functions inside or outside of the expression
	
	// call of function inside of the expression	
	public void visit(FunCallClass funcCall) {
		Obj functionObj = funcCall.getDesignator().obj;
		int offset = functionObj.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(offset);
	}
	
	// call of function outside of the expression
	public void visit(ProcCallClass procCall) {
		Obj functionObj = procCall.getDesignator().obj;
		int offset = functionObj.getAdr() - Code.pc;
		Code.put(Code.call);
		Code.put2(offset);
		
		if (procCall.getDesignator().obj.getType() != Tab.noType) {
			Code.put(Code.pop);
		}
	}
	
	public void visit(ReturnClass retClass) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	
	public void visit(ReturnNoExpressionClass retNoExprClass) {
		Code.put(Code.exit);
		Code.put(Code.return_);
	}
	//***************************
	
	// for expressions
	
	public void visit(AddExprClass addExpr) {
		Code.put(Code.mul); // because of the potentional minus
		Code.put(Code.add);
	}
	
	// next two visits are for minus if expression starts with minus
	public void visit(MinusOptClass withMinus) {
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(-1);
		
		Code.load(con);
	}
	public void visit(NoMinusOptClass withoutMinus) {
		// i dont need that extra one for new
		if (withoutMinus.getParent().getParent().getClass() == ListParamsExprExprClass.class) {
			Code.put(Code.pop);
		}
		
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(1);
		
		Code.load(con);
	}
	
	public void visit(MinusOpClass minusInsideExpression) {
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(-1);
		
		Code.load(con);
	}
	public void visit(AddOpClass noMinusInsideExpression) {
		Obj con = Tab.insert(Obj.Con, "$", Tab.intType);
		con.setLevel(0);
		con.setAdr(1);
		
		Code.load(con);
	}
	
	public void visit(ExprClass expr) {
		Code.put(Code.mul);
	}
	
	// operators mul div and rem
	
	public void visit(AsteriskClass mul) {
		Code.put(Code.mul);
	}
	
	public void visit(DivisionClass div) {
		Code.put(Code.div);
	}
	
	public void visit(PercentClass div) {
		Code.put(Code.rem);
	}
	
	
	//***************************
	
	// allocation space for the array
	
	public void visit(NewTypeClass newOperator) {
		Code.put(Code.newarray);
		this.newOperator = true;
	}
	
	
//	public void visit(ExprListIdentClass var) {
//		Code.put(Code.aload);
//	}
}
