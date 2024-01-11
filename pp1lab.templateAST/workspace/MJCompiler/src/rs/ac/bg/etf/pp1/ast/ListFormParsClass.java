// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class ListFormParsClass extends ListFormPars {

    private ListFormPars ListFormPars;
    private Type Type;
    private String I3;
    private BracketForArray BracketForArray;

    public ListFormParsClass (ListFormPars ListFormPars, Type Type, String I3, BracketForArray BracketForArray) {
        this.ListFormPars=ListFormPars;
        if(ListFormPars!=null) ListFormPars.setParent(this);
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I3=I3;
        this.BracketForArray=BracketForArray;
        if(BracketForArray!=null) BracketForArray.setParent(this);
    }

    public ListFormPars getListFormPars() {
        return ListFormPars;
    }

    public void setListFormPars(ListFormPars ListFormPars) {
        this.ListFormPars=ListFormPars;
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getI3() {
        return I3;
    }

    public void setI3(String I3) {
        this.I3=I3;
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
        if(ListFormPars!=null) ListFormPars.accept(visitor);
        if(Type!=null) Type.accept(visitor);
        if(BracketForArray!=null) BracketForArray.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListFormPars!=null) ListFormPars.traverseTopDown(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(BracketForArray!=null) BracketForArray.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListFormPars!=null) ListFormPars.traverseBottomUp(visitor);
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(BracketForArray!=null) BracketForArray.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListFormParsClass(\n");

        if(ListFormPars!=null)
            buffer.append(ListFormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I3);
        buffer.append("\n");

        if(BracketForArray!=null)
            buffer.append(BracketForArray.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListFormParsClass]");
        return buffer.toString();
    }
}
