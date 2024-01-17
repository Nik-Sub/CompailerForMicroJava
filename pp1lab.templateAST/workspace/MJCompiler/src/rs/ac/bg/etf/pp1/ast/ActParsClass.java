// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class ActParsClass extends ActPars {

    private Expr Expr;
    private ListExpr ListExpr;

    public ActParsClass (Expr Expr, ListExpr ListExpr) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.ListExpr=ListExpr;
        if(ListExpr!=null) ListExpr.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public ListExpr getListExpr() {
        return ListExpr;
    }

    public void setListExpr(ListExpr ListExpr) {
        this.ListExpr=ListExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(ListExpr!=null) ListExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(ListExpr!=null) ListExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(ListExpr!=null) ListExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ActParsClass(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ListExpr!=null)
            buffer.append(ListExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ActParsClass]");
        return buffer.toString();
    }
}
