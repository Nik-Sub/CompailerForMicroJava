// generated with ast extension for cup
// version 0.8
// 12/0/2024 15:9:10


package rs.ac.bg.etf.pp1.ast;

public class DesignatorClass extends Designator {

    private String desigName;
    private ListIdent ListIdent;

    public DesignatorClass (String desigName, ListIdent ListIdent) {
        this.desigName=desigName;
        this.ListIdent=ListIdent;
        if(ListIdent!=null) ListIdent.setParent(this);
    }

    public String getDesigName() {
        return desigName;
    }

    public void setDesigName(String desigName) {
        this.desigName=desigName;
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
        if(ListIdent!=null) ListIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListIdent!=null) ListIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListIdent!=null) ListIdent.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorClass(\n");

        buffer.append(" "+tab+desigName);
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
