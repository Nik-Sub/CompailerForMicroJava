// generated with ast extension for cup
// version 0.8
// 12/0/2024 21:12:52


package rs.ac.bg.etf.pp1.ast;

public class BoolconstDerived1 extends Boolconst {

    private Integer T1;

    public BoolconstDerived1 (Integer T1) {
        this.T1=T1;
    }

    public Integer getT1() {
        return T1;
    }

    public void setT1(Integer T1) {
        this.T1=T1;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolconstDerived1(\n");

        buffer.append(" "+tab+T1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolconstDerived1]");
        return buffer.toString();
    }
}
