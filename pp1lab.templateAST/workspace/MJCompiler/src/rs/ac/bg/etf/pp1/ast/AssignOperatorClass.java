// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class AssignOperatorClass extends ListExpressions {

    private AssignOperator AssignOperator;
    private Expr Expr;

    public AssignOperatorClass (AssignOperator AssignOperator, Expr Expr) {
        this.AssignOperator=AssignOperator;
        if(AssignOperator!=null) AssignOperator.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public AssignOperator getAssignOperator() {
        return AssignOperator;
    }

    public void setAssignOperator(AssignOperator AssignOperator) {
        this.AssignOperator=AssignOperator;
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AssignOperator!=null) AssignOperator.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AssignOperator!=null) AssignOperator.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AssignOperator!=null) AssignOperator.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AssignOperatorClass(\n");

        if(AssignOperator!=null)
            buffer.append(AssignOperator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AssignOperatorClass]");
        return buffer.toString();
    }
}