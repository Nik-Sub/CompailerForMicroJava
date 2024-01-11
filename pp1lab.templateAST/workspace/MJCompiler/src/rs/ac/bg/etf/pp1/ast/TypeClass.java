// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class TypeClass extends Type {

    private IdentOpt IdentOpt;
    private String typeName;

    public TypeClass (IdentOpt IdentOpt, String typeName) {
        this.IdentOpt=IdentOpt;
        if(IdentOpt!=null) IdentOpt.setParent(this);
        this.typeName=typeName;
    }

    public IdentOpt getIdentOpt() {
        return IdentOpt;
    }

    public void setIdentOpt(IdentOpt IdentOpt) {
        this.IdentOpt=IdentOpt;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName=typeName;
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

        buffer.append(" "+tab+typeName);
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [TypeClass]");
        return buffer.toString();
    }
}
