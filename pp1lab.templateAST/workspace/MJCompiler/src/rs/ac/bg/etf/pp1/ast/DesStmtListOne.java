// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class DesStmtListOne extends DesignatorStatementList {

    private OptDesStmtList OptDesStmtList;

    public DesStmtListOne (OptDesStmtList OptDesStmtList) {
        this.OptDesStmtList=OptDesStmtList;
        if(OptDesStmtList!=null) OptDesStmtList.setParent(this);
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
        if(OptDesStmtList!=null) OptDesStmtList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptDesStmtList!=null) OptDesStmtList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptDesStmtList!=null) OptDesStmtList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesStmtListOne(\n");

        if(OptDesStmtList!=null)
            buffer.append(OptDesStmtList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesStmtListOne]");
        return buffer.toString();
    }
}
