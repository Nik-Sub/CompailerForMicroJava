// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class DesignatorWithPrefixArrayClass extends Designator {

    private NameOfArrayWithPrefix NameOfArrayWithPrefix;
    private Expr Expr;

    public DesignatorWithPrefixArrayClass (NameOfArrayWithPrefix NameOfArrayWithPrefix, Expr Expr) {
        this.NameOfArrayWithPrefix=NameOfArrayWithPrefix;
        if(NameOfArrayWithPrefix!=null) NameOfArrayWithPrefix.setParent(this);
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
    }

    public NameOfArrayWithPrefix getNameOfArrayWithPrefix() {
        return NameOfArrayWithPrefix;
    }

    public void setNameOfArrayWithPrefix(NameOfArrayWithPrefix NameOfArrayWithPrefix) {
        this.NameOfArrayWithPrefix=NameOfArrayWithPrefix;
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
        if(NameOfArrayWithPrefix!=null) NameOfArrayWithPrefix.accept(visitor);
        if(Expr!=null) Expr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NameOfArrayWithPrefix!=null) NameOfArrayWithPrefix.traverseTopDown(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NameOfArrayWithPrefix!=null) NameOfArrayWithPrefix.traverseBottomUp(visitor);
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorWithPrefixArrayClass(\n");

        if(NameOfArrayWithPrefix!=null)
            buffer.append(NameOfArrayWithPrefix.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorWithPrefixArrayClass]");
        return buffer.toString();
    }
}
