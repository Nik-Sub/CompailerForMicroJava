// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class ListIdentClass extends ListIdent {

    private ListIdent ListIdent;
    private SufixForIdent SufixForIdent;

    public ListIdentClass (ListIdent ListIdent, SufixForIdent SufixForIdent) {
        this.ListIdent=ListIdent;
        if(ListIdent!=null) ListIdent.setParent(this);
        this.SufixForIdent=SufixForIdent;
        if(SufixForIdent!=null) SufixForIdent.setParent(this);
    }

    public ListIdent getListIdent() {
        return ListIdent;
    }

    public void setListIdent(ListIdent ListIdent) {
        this.ListIdent=ListIdent;
    }

    public SufixForIdent getSufixForIdent() {
        return SufixForIdent;
    }

    public void setSufixForIdent(SufixForIdent SufixForIdent) {
        this.SufixForIdent=SufixForIdent;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ListIdent!=null) ListIdent.accept(visitor);
        if(SufixForIdent!=null) SufixForIdent.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListIdent!=null) ListIdent.traverseTopDown(visitor);
        if(SufixForIdent!=null) SufixForIdent.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListIdent!=null) ListIdent.traverseBottomUp(visitor);
        if(SufixForIdent!=null) SufixForIdent.traverseBottomUp(visitor);
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

        if(SufixForIdent!=null)
            buffer.append(SufixForIdent.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListIdentClass]");
        return buffer.toString();
    }
}
