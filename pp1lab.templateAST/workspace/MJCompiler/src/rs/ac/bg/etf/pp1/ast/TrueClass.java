// generated with ast extension for cup
// version 0.8
// 16/0/2024 12:17:26


package rs.ac.bg.etf.pp1.ast;

public class TrueClass extends Boolconst {

    private String valTrue;

    public TrueClass (String valTrue) {
        this.valTrue=valTrue;
    }

    public String getValTrue() {
        return valTrue;
    }

    public void setValTrue(String valTrue) {
        this.valTrue=valTrue;
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
        buffer.append("TrueClass(\n");

        buffer.append(" "+tab+valTrue);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TrueClass]");
        return buffer.toString();
    }
}
