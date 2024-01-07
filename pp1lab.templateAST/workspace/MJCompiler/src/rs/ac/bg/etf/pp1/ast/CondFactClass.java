// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class CondFactClass extends CondFact {

    private Expr Expr;
    private OptRelop OptRelop;

    public CondFactClass (Expr Expr, OptRelop OptRelop) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.OptRelop=OptRelop;
        if(OptRelop!=null) OptRelop.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public OptRelop getOptRelop() {
        return OptRelop;
    }

    public void setOptRelop(OptRelop OptRelop) {
        this.OptRelop=OptRelop;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(OptRelop!=null) OptRelop.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(OptRelop!=null) OptRelop.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(OptRelop!=null) OptRelop.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFactClass(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptRelop!=null)
            buffer.append(OptRelop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFactClass]");
        return buffer.toString();
    }
}
