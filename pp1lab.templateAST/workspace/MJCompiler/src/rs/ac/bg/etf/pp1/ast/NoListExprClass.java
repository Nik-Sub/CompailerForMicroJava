// generated with ast extension for cup
// version 0.8
// 12/0/2024 15:9:10


package rs.ac.bg.etf.pp1.ast;

public class NoListExprClass extends ListExpr {

    public NoListExprClass () {
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
        buffer.append("NoListExprClass(\n");

        buffer.append(tab);
        buffer.append(") [NoListExprClass]");
        return buffer.toString();
    }
}
