// generated with ast extension for cup
// version 0.8
// 16/0/2024 12:17:26


package rs.ac.bg.etf.pp1.ast;

public class ReturnNoExpressionClass extends Statement {

    public ReturnNoExpressionClass () {
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
        buffer.append("ReturnNoExpressionClass(\n");

        buffer.append(tab);
        buffer.append(") [ReturnNoExpressionClass]");
        return buffer.toString();
    }
}
