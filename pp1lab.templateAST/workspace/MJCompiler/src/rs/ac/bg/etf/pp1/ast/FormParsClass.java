// generated with ast extension for cup
// version 0.8
// 12/0/2024 21:12:53


package rs.ac.bg.etf.pp1.ast;

public class FormParsClass extends FormPars {

    private Type Type;
    private KindOfPar KindOfPar;
    private ListFormPars ListFormPars;

    public FormParsClass (Type Type, KindOfPar KindOfPar, ListFormPars ListFormPars) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.KindOfPar=KindOfPar;
        if(KindOfPar!=null) KindOfPar.setParent(this);
        this.ListFormPars=ListFormPars;
        if(ListFormPars!=null) ListFormPars.setParent(this);
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

    public ListFormPars getListFormPars() {
        return ListFormPars;
    }

    public void setListFormPars(ListFormPars ListFormPars) {
        this.ListFormPars=ListFormPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(KindOfPar!=null) KindOfPar.accept(visitor);
        if(ListFormPars!=null) ListFormPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(KindOfPar!=null) KindOfPar.traverseTopDown(visitor);
        if(ListFormPars!=null) ListFormPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(KindOfPar!=null) KindOfPar.traverseBottomUp(visitor);
        if(ListFormPars!=null) ListFormPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsClass(\n");

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

        if(ListFormPars!=null)
            buffer.append(ListFormPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsClass]");
        return buffer.toString();
    }
}
