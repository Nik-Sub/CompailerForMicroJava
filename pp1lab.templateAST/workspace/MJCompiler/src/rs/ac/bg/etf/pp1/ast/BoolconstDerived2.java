// generated with ast extension for cup
// version 0.8
// 12/0/2024 21:12:52


package rs.ac.bg.etf.pp1.ast;

public class BoolconstDerived2 extends Boolconst {

    private Integer F1;

    public BoolconstDerived2 (Integer F1) {
        this.F1=F1;
    }

    public Integer getF1() {
        return F1;
    }

    public void setF1(Integer F1) {
        this.F1=F1;
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
        buffer.append("BoolconstDerived2(\n");

        buffer.append(" "+tab+F1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolconstDerived2]");
        return buffer.toString();
    }
}
