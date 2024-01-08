// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementList1 extends DesignatorStatementList {

    private DesignatorStatementList DesignatorStatementList;
    private OptDesStmtList OptDesStmtList;

    public DesignatorStatementList1 (DesignatorStatementList DesignatorStatementList, OptDesStmtList OptDesStmtList) {
        this.DesignatorStatementList=DesignatorStatementList;
        if(DesignatorStatementList!=null) DesignatorStatementList.setParent(this);
        this.OptDesStmtList=OptDesStmtList;
        if(OptDesStmtList!=null) OptDesStmtList.setParent(this);
    }

    public DesignatorStatementList getDesignatorStatementList() {
        return DesignatorStatementList;
    }

    public void setDesignatorStatementList(DesignatorStatementList DesignatorStatementList) {
        this.DesignatorStatementList=DesignatorStatementList;
    }

    public OptDesStmtList getOptDesStmtList() {
        return OptDesStmtList;
    }

    public void setOptDesStmtList(OptDesStmtList OptDesStmtList) {
        this.OptDesStmtList=OptDesStmtList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorStatementList!=null) DesignatorStatementList.accept(visitor);
        if(OptDesStmtList!=null) OptDesStmtList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorStatementList!=null) DesignatorStatementList.traverseTopDown(visitor);
        if(OptDesStmtList!=null) OptDesStmtList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorStatementList!=null) DesignatorStatementList.traverseBottomUp(visitor);
        if(OptDesStmtList!=null) OptDesStmtList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementList1(\n");

        if(DesignatorStatementList!=null)
            buffer.append(DesignatorStatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptDesStmtList!=null)
            buffer.append(OptDesStmtList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementList1]");
        return buffer.toString();
    }
}
