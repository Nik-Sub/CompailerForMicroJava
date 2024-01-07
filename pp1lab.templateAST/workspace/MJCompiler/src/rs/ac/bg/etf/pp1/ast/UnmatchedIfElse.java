// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class UnmatchedIfElse extends UnmtchStatement {

    private Condition Condition;
    private MtchStatement MtchStatement;
    private UnmtchStatement UnmtchStatement;

    public UnmatchedIfElse (Condition Condition, MtchStatement MtchStatement, UnmtchStatement UnmtchStatement) {
        this.Condition=Condition;
        if(Condition!=null) Condition.setParent(this);
        this.MtchStatement=MtchStatement;
        if(MtchStatement!=null) MtchStatement.setParent(this);
        this.UnmtchStatement=UnmtchStatement;
        if(UnmtchStatement!=null) UnmtchStatement.setParent(this);
    }

    public Condition getCondition() {
        return Condition;
    }

    public void setCondition(Condition Condition) {
        this.Condition=Condition;
    }

    public MtchStatement getMtchStatement() {
        return MtchStatement;
    }

    public void setMtchStatement(MtchStatement MtchStatement) {
        this.MtchStatement=MtchStatement;
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
        if(Condition!=null) Condition.accept(visitor);
        if(MtchStatement!=null) MtchStatement.accept(visitor);
        if(UnmtchStatement!=null) UnmtchStatement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Condition!=null) Condition.traverseTopDown(visitor);
        if(MtchStatement!=null) MtchStatement.traverseTopDown(visitor);
        if(UnmtchStatement!=null) UnmtchStatement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Condition!=null) Condition.traverseBottomUp(visitor);
        if(MtchStatement!=null) MtchStatement.traverseBottomUp(visitor);
        if(UnmtchStatement!=null) UnmtchStatement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("UnmatchedIfElse(\n");

        if(Condition!=null)
            buffer.append(Condition.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MtchStatement!=null)
            buffer.append(MtchStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(UnmtchStatement!=null)
            buffer.append(UnmtchStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [UnmatchedIfElse]");
        return buffer.toString();
    }
}
