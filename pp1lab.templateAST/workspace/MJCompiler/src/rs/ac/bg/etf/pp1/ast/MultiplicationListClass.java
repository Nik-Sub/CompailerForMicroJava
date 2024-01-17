// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class MultiplicationListClass extends MultiplicationList {

    private Mulop Mulop;
    private MultiplicationList MultiplicationList;

    public MultiplicationListClass (Mulop Mulop, MultiplicationList MultiplicationList) {
        this.Mulop=Mulop;
        if(Mulop!=null) Mulop.setParent(this);
        this.MultiplicationList=MultiplicationList;
        if(MultiplicationList!=null) MultiplicationList.setParent(this);
    }

    public Mulop getMulop() {
        return Mulop;
    }

    public void setMulop(Mulop Mulop) {
        this.Mulop=Mulop;
    }

    public MultiplicationList getMultiplicationList() {
        return MultiplicationList;
    }

    public void setMultiplicationList(MultiplicationList MultiplicationList) {
        this.MultiplicationList=MultiplicationList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Mulop!=null) Mulop.accept(visitor);
        if(MultiplicationList!=null) MultiplicationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Mulop!=null) Mulop.traverseTopDown(visitor);
        if(MultiplicationList!=null) MultiplicationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Mulop!=null) Mulop.traverseBottomUp(visitor);
        if(MultiplicationList!=null) MultiplicationList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MultiplicationListClass(\n");

        if(Mulop!=null)
            buffer.append(Mulop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MultiplicationList!=null)
            buffer.append(MultiplicationList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MultiplicationListClass]");
        return buffer.toString();
    }
}
