// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class LetterClass extends Factor {

    private char L1;

    public LetterClass (char L1) {
        this.L1=L1;
    }

    public char getL1() {
        return L1;
    }

    public void setL1(char L1) {
        this.L1=L1;
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
        buffer.append("LetterClass(\n");

        buffer.append(" "+tab+L1);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [LetterClass]");
        return buffer.toString();
    }
}
