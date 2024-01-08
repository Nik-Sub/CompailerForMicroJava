// generated with ast extension for cup
// version 0.8
// 8/0/2024 15:53:9


package rs.ac.bg.etf.pp1.ast;

public class DesignatorStatementWithSomeOperationsClass extends DesignatorStatement {

    private Designator Designator;
    private ListExpressions ListExpressions;

    public DesignatorStatementWithSomeOperationsClass (Designator Designator, ListExpressions ListExpressions) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ListExpressions=ListExpressions;
        if(ListExpressions!=null) ListExpressions.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ListExpressions getListExpressions() {
        return ListExpressions;
    }

    public void setListExpressions(ListExpressions ListExpressions) {
        this.ListExpressions=ListExpressions;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ListExpressions!=null) ListExpressions.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ListExpressions!=null) ListExpressions.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ListExpressions!=null) ListExpressions.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorStatementWithSomeOperationsClass(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ListExpressions!=null)
            buffer.append(ListExpressions.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorStatementWithSomeOperationsClass]");
        return buffer.toString();
    }
}
