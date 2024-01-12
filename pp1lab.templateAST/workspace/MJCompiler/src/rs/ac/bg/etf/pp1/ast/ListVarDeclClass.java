// generated with ast extension for cup
// version 0.8
// 12/0/2024 15:9:10


package rs.ac.bg.etf.pp1.ast;

public class ListVarDeclClass extends ListVarDecl {

    private KindOfVar KindOfVar;
    private ListVarDecl ListVarDecl;

    public ListVarDeclClass (KindOfVar KindOfVar, ListVarDecl ListVarDecl) {
        this.KindOfVar=KindOfVar;
        if(KindOfVar!=null) KindOfVar.setParent(this);
        this.ListVarDecl=ListVarDecl;
        if(ListVarDecl!=null) ListVarDecl.setParent(this);
    }

    public KindOfVar getKindOfVar() {
        return KindOfVar;
    }

    public void setKindOfVar(KindOfVar KindOfVar) {
        this.KindOfVar=KindOfVar;
    }

    public ListVarDecl getListVarDecl() {
        return ListVarDecl;
    }

    public void setListVarDecl(ListVarDecl ListVarDecl) {
        this.ListVarDecl=ListVarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(KindOfVar!=null) KindOfVar.accept(visitor);
        if(ListVarDecl!=null) ListVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(KindOfVar!=null) KindOfVar.traverseTopDown(visitor);
        if(ListVarDecl!=null) ListVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(KindOfVar!=null) KindOfVar.traverseBottomUp(visitor);
        if(ListVarDecl!=null) ListVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListVarDeclClass(\n");

        if(KindOfVar!=null)
            buffer.append(KindOfVar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ListVarDecl!=null)
            buffer.append(ListVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListVarDeclClass]");
        return buffer.toString();
    }
}
