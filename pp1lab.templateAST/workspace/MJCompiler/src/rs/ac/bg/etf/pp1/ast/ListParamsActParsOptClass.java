// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class ListParamsActParsOptClass extends ListParams {

    private ActParsOpt ActParsOpt;

    public ListParamsActParsOptClass (ActParsOpt ActParsOpt) {
        this.ActParsOpt=ActParsOpt;
        if(ActParsOpt!=null) ActParsOpt.setParent(this);
    }

    public ActParsOpt getActParsOpt() {
        return ActParsOpt;
    }

    public void setActParsOpt(ActParsOpt ActParsOpt) {
        this.ActParsOpt=ActParsOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ActParsOpt!=null) ActParsOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ActParsOpt!=null) ActParsOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ActParsOpt!=null) ActParsOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListParamsActParsOptClass(\n");

        if(ActParsOpt!=null)
            buffer.append(ActParsOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListParamsActParsOptClass]");
        return buffer.toString();
    }
}
