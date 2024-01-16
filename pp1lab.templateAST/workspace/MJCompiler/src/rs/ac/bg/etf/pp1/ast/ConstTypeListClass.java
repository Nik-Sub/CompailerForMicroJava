// generated with ast extension for cup
// version 0.8
// 16/0/2024 10:44:15


package rs.ac.bg.etf.pp1.ast;

public class ConstTypeListClass extends ConstTypeList {

    private ConstTypeList ConstTypeList;
    private ConstInit ConstInit;

    public ConstTypeListClass (ConstTypeList ConstTypeList, ConstInit ConstInit) {
        this.ConstTypeList=ConstTypeList;
        if(ConstTypeList!=null) ConstTypeList.setParent(this);
        this.ConstInit=ConstInit;
        if(ConstInit!=null) ConstInit.setParent(this);
    }

    public ConstTypeList getConstTypeList() {
        return ConstTypeList;
    }

    public void setConstTypeList(ConstTypeList ConstTypeList) {
        this.ConstTypeList=ConstTypeList;
    }

    public ConstInit getConstInit() {
        return ConstInit;
    }

    public void setConstInit(ConstInit ConstInit) {
        this.ConstInit=ConstInit;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstTypeList!=null) ConstTypeList.accept(visitor);
        if(ConstInit!=null) ConstInit.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstTypeList!=null) ConstTypeList.traverseTopDown(visitor);
        if(ConstInit!=null) ConstInit.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstTypeList!=null) ConstTypeList.traverseBottomUp(visitor);
        if(ConstInit!=null) ConstInit.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstTypeListClass(\n");

        if(ConstTypeList!=null)
            buffer.append(ConstTypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstInit!=null)
            buffer.append(ConstInit.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstTypeListClass]");
        return buffer.toString();
    }
}
