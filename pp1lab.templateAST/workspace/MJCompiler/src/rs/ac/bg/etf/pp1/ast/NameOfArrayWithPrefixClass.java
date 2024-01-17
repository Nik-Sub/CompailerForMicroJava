// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class NameOfArrayWithPrefixClass extends NameOfArrayWithPrefix {

    private String prefix;
    private String desigName;

    public NameOfArrayWithPrefixClass (String prefix, String desigName) {
        this.prefix=prefix;
        this.desigName=desigName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix=prefix;
    }

    public String getDesigName() {
        return desigName;
    }

    public void setDesigName(String desigName) {
        this.desigName=desigName;
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
        buffer.append("NameOfArrayWithPrefixClass(\n");

        buffer.append(" "+tab+prefix);
        buffer.append("\n");

        buffer.append(" "+tab+desigName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NameOfArrayWithPrefixClass]");
        return buffer.toString();
    }
}
