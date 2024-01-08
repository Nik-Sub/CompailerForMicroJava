// generated with ast extension for cup
// version 0.8
// 8/0/2024 15:53:9


package rs.ac.bg.etf.pp1.ast;

public class ListVarDeclClass extends ListVarDecl {

    private ListVarDecl ListVarDecl;
    private String I2;
    private BracketForArray BracketForArray;

    public ListVarDeclClass (ListVarDecl ListVarDecl, String I2, BracketForArray BracketForArray) {
        this.ListVarDecl=ListVarDecl;
        if(ListVarDecl!=null) ListVarDecl.setParent(this);
        this.I2=I2;
        this.BracketForArray=BracketForArray;
        if(BracketForArray!=null) BracketForArray.setParent(this);
    }

    public ListVarDecl getListVarDecl() {
        return ListVarDecl;
    }

    public void setListVarDecl(ListVarDecl ListVarDecl) {
        this.ListVarDecl=ListVarDecl;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public BracketForArray getBracketForArray() {
        return BracketForArray;
    }

    public void setBracketForArray(BracketForArray BracketForArray) {
        this.BracketForArray=BracketForArray;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ListVarDecl!=null) ListVarDecl.accept(visitor);
        if(BracketForArray!=null) BracketForArray.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListVarDecl!=null) ListVarDecl.traverseTopDown(visitor);
        if(BracketForArray!=null) BracketForArray.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListVarDecl!=null) ListVarDecl.traverseBottomUp(visitor);
        if(BracketForArray!=null) BracketForArray.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListVarDeclClass(\n");

        if(ListVarDecl!=null)
            buffer.append(ListVarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(BracketForArray!=null)
            buffer.append(BracketForArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListVarDeclClass]");
        return buffer.toString();
    }
}
