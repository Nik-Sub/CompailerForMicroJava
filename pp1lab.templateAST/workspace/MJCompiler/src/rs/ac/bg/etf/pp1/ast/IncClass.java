// generated with ast extension for cup
// version 0.8
// 8/0/2024 15:53:9


package rs.ac.bg.etf.pp1.ast;

public class IncClass extends ListExpressions {

    public IncClass () {
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
        buffer.append("IncClass(\n");

        buffer.append(tab);
        buffer.append(") [IncClass]");
        return buffer.toString();
    }
}
