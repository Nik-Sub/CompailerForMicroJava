// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class ListVarDeclClass extends ListVarDecl {

    private String I1;
    private BracketForArray BracketForArray;
    private ListVarDecl ListVarDecl;

    public ListVarDeclClass (String I1, BracketForArray BracketForArray, ListVarDecl ListVarDecl) {
        this.I1=I1;
        this.BracketForArray=BracketForArray;
        if(BracketForArray!=null) BracketForArray.setParent(this);
        this.ListVarDecl=ListVarDecl;
        if(ListVarDecl!=null) ListVarDecl.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public BracketForArray getBracketForArray() {
        return BracketForArray;
    }

    public void setBracketForArray(BracketForArray BracketForArray) {
        this.BracketForArray=BracketForArray;
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
        if(BracketForArray!=null) BracketForArray.accept(visitor);
        if(ListVarDecl!=null) ListVarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BracketForArray!=null) BracketForArray.traverseTopDown(visitor);
        if(ListVarDecl!=null) ListVarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BracketForArray!=null) BracketForArray.traverseBottomUp(visitor);
        if(ListVarDecl!=null) ListVarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListVarDeclClass(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(BracketForArray!=null)
            buffer.append(BracketForArray.toString("  "+tab));
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
