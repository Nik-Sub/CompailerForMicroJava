// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class AssignopClass extends Assignop {

    public AssignopClass () {
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
        buffer.append("AssignopClass(\n");

        buffer.append(tab);
        buffer.append(") [AssignopClass]");
        return buffer.toString();
    }
}
