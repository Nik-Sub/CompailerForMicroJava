// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class NoConstTypeListClass extends ConstTypeList {

    public NoConstTypeListClass () {
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
        buffer.append("NoConstTypeListClass(\n");

        buffer.append(tab);
        buffer.append(") [NoConstTypeListClass]");
        return buffer.toString();
    }
}
