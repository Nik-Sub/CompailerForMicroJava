// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class DesignatorClass extends Designator {

    private IdentOpt IdentOpt;
    private String I2;
    private ListIdent ListIdent;

    public DesignatorClass (IdentOpt IdentOpt, String I2, ListIdent ListIdent) {
        this.IdentOpt=IdentOpt;
        if(IdentOpt!=null) IdentOpt.setParent(this);
        this.I2=I2;
        this.ListIdent=ListIdent;
        if(ListIdent!=null) ListIdent.setParent(this);
    }

    public IdentOpt getIdentOpt() {
        return IdentOpt;
    }

    public void setIdentOpt(IdentOpt IdentOpt) {
        this.IdentOpt=IdentOpt;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public ListIdent getListIdent() {
        return ListIdent;
    }

    public void setListIdent(ListIdent ListIdent) {
        this.ListIdent=ListIdent;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IdentOpt!=null) IdentOpt.accept(visitor);
        if(ListIdent!=null) ListIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IdentOpt!=null) IdentOpt.traverseTopDown(visitor);
        if(ListIdent!=null) ListIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IdentOpt!=null) IdentOpt.traverseBottomUp(visitor);
        if(ListIdent!=null) ListIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorClass(\n");

        if(IdentOpt!=null)
            buffer.append(IdentOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(ListIdent!=null)
            buffer.append(ListIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorClass]");
        return buffer.toString();
    }
}