// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class MatchedStmt extends Statement {

    private MtchStatement MtchStatement;

    public MatchedStmt (MtchStatement MtchStatement) {
        this.MtchStatement=MtchStatement;
        if(MtchStatement!=null) MtchStatement.setParent(this);
    }

    public MtchStatement getMtchStatement() {
        return MtchStatement;
    }

    public void setMtchStatement(MtchStatement MtchStatement) {
        this.MtchStatement=MtchStatement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MtchStatement!=null) MtchStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MtchStatement!=null) MtchStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MtchStatement!=null) MtchStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MatchedStmt(\n");

        if(MtchStatement!=null)
            buffer.append(MtchStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MatchedStmt]");
        return buffer.toString();
    }
}
