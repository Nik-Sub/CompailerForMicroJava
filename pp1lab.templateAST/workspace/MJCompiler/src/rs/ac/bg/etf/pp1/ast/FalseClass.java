// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class FalseClass extends Boolconst {

    private String valFalse;

    public FalseClass (String valFalse) {
        this.valFalse=valFalse;
    }

    public String getValFalse() {
        return valFalse;
    }

    public void setValFalse(String valFalse) {
        this.valFalse=valFalse;
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
        buffer.append("FalseClass(\n");

        buffer.append(" "+tab+valFalse);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FalseClass]");
        return buffer.toString();
    }
}
