// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class NoMinusOptClass extends MinusOpt {

    public NoMinusOptClass () {
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
        buffer.append("NoMinusOptClass(\n");

        buffer.append(tab);
        buffer.append(") [NoMinusOptClass]");
        return buffer.toString();
    }
}
