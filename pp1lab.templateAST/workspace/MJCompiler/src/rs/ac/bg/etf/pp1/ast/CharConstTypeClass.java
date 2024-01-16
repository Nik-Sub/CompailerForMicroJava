// generated with ast extension for cup
// version 0.8
// 16/0/2024 12:17:26


package rs.ac.bg.etf.pp1.ast;

public class CharConstTypeClass extends ConstType {

    private char value;

    public CharConstTypeClass (char value) {
        this.value=value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value=value;
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
        buffer.append("CharConstTypeClass(\n");

        buffer.append(" "+tab+value);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CharConstTypeClass]");
        return buffer.toString();
    }
}
