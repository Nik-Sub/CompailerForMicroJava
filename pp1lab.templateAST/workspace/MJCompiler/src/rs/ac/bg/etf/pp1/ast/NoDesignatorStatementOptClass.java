// generated with ast extension for cup
// version 0.8
// 12/0/2024 15:9:10


package rs.ac.bg.etf.pp1.ast;

public class NoDesignatorStatementOptClass extends DesignatorStatementOpt {

    public NoDesignatorStatementOptClass () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoDesignatorStatementOptClass(\n");

        buffer.append(tab);
        buffer.append(") [NoDesignatorStatementOptClass]");
        return buffer.toString();
    }
}
