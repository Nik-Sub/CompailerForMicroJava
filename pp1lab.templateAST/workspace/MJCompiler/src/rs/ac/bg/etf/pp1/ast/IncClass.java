// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class IncClass extends ListExpressions {

    private Inc Inc;

    public IncClass (Inc Inc) {
        this.Inc=Inc;
        if(Inc!=null) Inc.setParent(this);
    }

    public Inc getInc() {
        return Inc;
    }

    public void setInc(Inc Inc) {
        this.Inc=Inc;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Inc!=null) Inc.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Inc!=null) Inc.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Inc!=null) Inc.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("IncClass(\n");

        if(Inc!=null)
            buffer.append(Inc.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [IncClass]");
        return buffer.toString();
    }
}
