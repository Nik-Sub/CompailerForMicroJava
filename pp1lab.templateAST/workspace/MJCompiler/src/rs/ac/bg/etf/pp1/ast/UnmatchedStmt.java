// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedStmt extends Statement {

    private UnmtchStatement UnmtchStatement;

    public UnmatchedStmt (UnmtchStatement UnmtchStatement) {
        this.UnmtchStatement=UnmtchStatement;
        if(UnmtchStatement!=null) UnmtchStatement.setParent(this);
    }

    public UnmtchStatement getUnmtchStatement() {
        return UnmtchStatement;
    }

    public void setUnmtchStatement(UnmtchStatement UnmtchStatement) {
        this.UnmtchStatement=UnmtchStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(UnmtchStatement!=null) UnmtchStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(UnmtchStatement!=null) UnmtchStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(UnmtchStatement!=null) UnmtchStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedStmt(\n");

        if(UnmtchStatement!=null)
            buffer.append(UnmtchStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedStmt]");
        return buffer.toString();
    }
}
