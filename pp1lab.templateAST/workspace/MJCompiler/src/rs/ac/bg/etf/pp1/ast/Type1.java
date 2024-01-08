// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class Type1 extends Type {

    private IdentOpt IdentOpt;
    private String I2;

    public Type1 (IdentOpt IdentOpt, String I2) {
        this.IdentOpt=IdentOpt;
        if(IdentOpt!=null) IdentOpt.setParent(this);
        this.I2=I2;
    }

    public IdentOpt getIdentOpt() {
        return IdentOpt;
    }

    public void setIdentOpt(IdentOpt IdentOpt) {
        this.IdentOpt=IdentOpt;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(IdentOpt!=null) IdentOpt.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(IdentOpt!=null) IdentOpt.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(IdentOpt!=null) IdentOpt.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Type1(\n");

        if(IdentOpt!=null)
            buffer.append(IdentOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Type1]");
        return buffer.toString();
    }
}
