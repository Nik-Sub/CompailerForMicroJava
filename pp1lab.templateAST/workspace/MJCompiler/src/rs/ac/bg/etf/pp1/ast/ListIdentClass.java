// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class ListIdentClass extends ListIdent {

    private ListIdent ListIdent;

    public ListIdentClass (ListIdent ListIdent) {
        this.ListIdent=ListIdent;
        if(ListIdent!=null) ListIdent.setParent(this);
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
        buffer.append("ListIdentClass(\n");

        if(ListIdent!=null)
            buffer.append(ListIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListIdentClass]");
        return buffer.toString();
    }
}
