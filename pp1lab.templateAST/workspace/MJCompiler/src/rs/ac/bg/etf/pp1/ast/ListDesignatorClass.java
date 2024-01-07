// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class ListDesignatorClass extends ListDesignator {

    private ListDesignator ListDesignator;
    private DesignatorOpt DesignatorOpt;

    public ListDesignatorClass (ListDesignator ListDesignator, DesignatorOpt DesignatorOpt) {
        this.ListDesignator=ListDesignator;
        if(ListDesignator!=null) ListDesignator.setParent(this);
        this.DesignatorOpt=DesignatorOpt;
        if(DesignatorOpt!=null) DesignatorOpt.setParent(this);
    }

    public ListDesignator getListDesignator() {
        return ListDesignator;
    }

    public void setListDesignator(ListDesignator ListDesignator) {
        this.ListDesignator=ListDesignator;
    }

    public DesignatorOpt getDesignatorOpt() {
        return DesignatorOpt;
    }

    public void setDesignatorOpt(DesignatorOpt DesignatorOpt) {
        this.DesignatorOpt=DesignatorOpt;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ListDesignator!=null) ListDesignator.accept(visitor);
        if(DesignatorOpt!=null) DesignatorOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ListDesignator!=null) ListDesignator.traverseTopDown(visitor);
        if(DesignatorOpt!=null) DesignatorOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ListDesignator!=null) ListDesignator.traverseBottomUp(visitor);
        if(DesignatorOpt!=null) DesignatorOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ListDesignatorClass(\n");

        if(ListDesignator!=null)
            buffer.append(ListDesignator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorOpt!=null)
            buffer.append(DesignatorOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ListDesignatorClass]");
        return buffer.toString();
    }
}
