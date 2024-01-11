package rs.ac.bg.etf.pp1;

import rs.ac.bg.etf.pp1.ast.*;
import org.apache.log4j.*;

public class RuleVisitor extends VisitorAdaptor{
	
	Logger log = Logger.getLogger(getClass());
	int printCallCount = 0;
	int varDeclCount = 0;
	
	public void visit(VarDeclClass varDecl) {
		varDeclCount++;
	}
	
	 //ako je pozvan print iz programa
	public void visit(PrintClass PrintStmt) {
		printCallCount++;
		//log.info("Prepoznata naredba print!");
	}

}
