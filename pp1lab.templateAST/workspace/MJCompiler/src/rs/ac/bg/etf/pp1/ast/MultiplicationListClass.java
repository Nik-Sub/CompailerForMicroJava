// generated with ast extension for cup
// version 0.8
// 12/0/2024 15:9:10


package rs.ac.bg.etf.pp1.ast;

public class MultiplicationListClass extends MultiplicationList {

    private Mulop Mulop;
    private Factor Factor;
    private MultiplicationList MultiplicationList;

    public MultiplicationListClass (Mulop Mulop, Factor Factor, MultiplicationList MultiplicationList) {
        this.Mulop=Mulop;
        if(Mulop!=null) Mulop.setParent(this);
        this.Factor=Factor;
        if(Factor!=null) Factor.setParent(this);
        this.MultiplicationList=MultiplicationList;
        if(MultiplicationList!=null) MultiplicationList.setParent(this);
    }

    public Mulop getMulop() {
        return Mulop;
    }

    public void setMulop(Mulop Mulop) {
        this.Mulop=Mulop;
    }

    public Factor getFactor() {
        return Factor;
    }

    public void setFactor(Factor Factor) {
        this.Factor=Factor;
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
        if(Factor!=null) Factor.accept(visitor);
        if(MultiplicationList!=null) MultiplicationList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Mulop!=null) Mulop.traverseTopDown(visitor);
        if(Factor!=null) Factor.traverseTopDown(visitor);
        if(MultiplicationList!=null) MultiplicationList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Mulop!=null) Mulop.traverseBottomUp(visitor);
        if(Factor!=null) Factor.traverseBottomUp(visitor);
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

        if(Factor!=null)
            buffer.append(Factor.toString("  "+tab));
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
