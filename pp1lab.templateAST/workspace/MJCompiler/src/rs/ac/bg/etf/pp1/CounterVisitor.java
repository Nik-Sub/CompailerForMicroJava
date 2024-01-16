package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.Tab;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class CounterVisitor extends VisitorAdaptor {
	
	protected int count;
	
	public int getCount() {
		return count;
	}
	
	// for mehtods
	public static class FormParamCounter extends CounterVisitor{
		public void visit(ParNoArrayClass noArray) {
			count++;
		}
		
		public void visit(ParArrayClass array) {
			count++;
		}
	}
	
	// global
	public static class VarCounter extends CounterVisitor{
		public void visit(VarNoArrayClass noArray) {
			count++;
		}
		
		public void visit(VarArrayClass array) {
			count++;
		}
	}
	
}
