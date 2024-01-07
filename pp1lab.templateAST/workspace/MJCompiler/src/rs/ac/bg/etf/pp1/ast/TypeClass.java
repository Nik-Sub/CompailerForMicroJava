// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:47


package rs.ac.bg.etf.pp1.ast;

public class TypeClass extends Type {

    private IdentOpt IdentOpt;
    private String I2;

    public TypeClass (IdentOpt IdentOpt, String I2) {
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
        buffer.append("TypeClass(\n");

        if(IdentOpt!=null)
            buffer.append(IdentOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TypeClass]");
        return buffer.toString();
    }
}
