// generated with ast extension for cup
// version 0.8
// 12/0/2024 21:12:53


package rs.ac.bg.etf.pp1.ast;

public class ListFormParsClass extends ListFormPars {

    private ListFormPars ListFormPars;
    private Type Type;
    private KindOfPar KindOfPar;

    public ListFormParsClass (ListFormPars ListFormPars, Type Type, KindOfPar KindOfPar) {
        this.ListFormPars=ListFormPars;
        if(ListFormPars!=null) ListFormPars.setParent(this);
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.KindOfPar=KindOfPar;
        if(KindOfPar!=null) KindOfPar.setParent(this);
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

    public KindOfPar getKindOfPar() {
        return KindOfPar;
    }

    public void setKindOfPar(KindOfPar KindOfPar) {
        this.KindOfPar=KindOfPar;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ListFormPars!=null) ListFormPars.accept(visitor);
        if(Type!=null) Type.accept(visitor);
        if(KindOfPar!=null) KindOfPar.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListFormPars!=null) ListFormPars.traverseTopDown(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(KindOfPar!=null) KindOfPar.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListFormPars!=null) ListFormPars.traverseBottomUp(visitor);
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(KindOfPar!=null) KindOfPar.traverseBottomUp(visitor);
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

        if(KindOfPar!=null)
            buffer.append(KindOfPar.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListFormParsClass]");
        return buffer.toString();
    }
}
