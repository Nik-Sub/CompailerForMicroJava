// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class StmtForSNS extends MatchedStatement {

    private DesignatorStatement DesignatorStatement;
    private StatementList StatementList;
    private DesignatorStatement DesignatorStatement1;
    private StatementList StatementList2;
    private Statement Statement;

    public StmtForSNS (DesignatorStatement DesignatorStatement, StatementList StatementList, DesignatorStatement DesignatorStatement1, StatementList StatementList2, Statement Statement) {
        this.DesignatorStatement=DesignatorStatement;
        if(DesignatorStatement!=null) DesignatorStatement.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
        this.DesignatorStatement1=DesignatorStatement1;
        if(DesignatorStatement1!=null) DesignatorStatement1.setParent(this);
        this.StatementList2=StatementList2;
        if(StatementList2!=null) StatementList2.setParent(this);
        this.Statement=Statement;
        if(Statement!=null) Statement.setParent(this);
    }

    public DesignatorStatement getDesignatorStatement() {
        return DesignatorStatement;
    }

    public void setDesignatorStatement(DesignatorStatement DesignatorStatement) {
        this.DesignatorStatement=DesignatorStatement;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
    }

    public DesignatorStatement getDesignatorStatement1() {
        return DesignatorStatement1;
    }

    public void setDesignatorStatement1(DesignatorStatement DesignatorStatement1) {
        this.DesignatorStatement1=DesignatorStatement1;
    }

    public StatementList getStatementList2() {
        return StatementList2;
    }

    public void setStatementList2(StatementList StatementList2) {
        this.StatementList2=StatementList2;
    }

    public Statement getStatement() {
        return Statement;
    }

    public void setStatement(Statement Statement) {
        this.Statement=Statement;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatement!=null) DesignatorStatement.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
        if(DesignatorStatement1!=null) DesignatorStatement1.accept(visitor);
        if(StatementList2!=null) StatementList2.accept(visitor);
        if(Statement!=null) Statement.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatement!=null) DesignatorStatement.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
        if(DesignatorStatement1!=null) DesignatorStatement1.traverseTopDown(visitor);
        if(StatementList2!=null) StatementList2.traverseTopDown(visitor);
        if(Statement!=null) Statement.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatement!=null) DesignatorStatement.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        if(DesignatorStatement1!=null) DesignatorStatement1.traverseBottomUp(visitor);
        if(StatementList2!=null) StatementList2.traverseBottomUp(visitor);
        if(Statement!=null) Statement.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StmtForSNS(\n");

        if(DesignatorStatement!=null)
            buffer.append(DesignatorStatement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorStatement1!=null)
            buffer.append(DesignatorStatement1.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList2!=null)
            buffer.append(StatementList2.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statement!=null)
            buffer.append(Statement.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StmtForSNS]");
        return buffer.toString();
    }
}
