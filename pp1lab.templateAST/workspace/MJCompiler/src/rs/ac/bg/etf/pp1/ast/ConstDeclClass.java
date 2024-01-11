// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclClass extends ConstDecl {

    private Type Type;
    private String I2;
    private ConstType ConstType;
    private ConstTypeList ConstTypeList;

    public ConstDeclClass (Type Type, String I2, ConstType ConstType, ConstTypeList ConstTypeList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.I2=I2;
        this.ConstType=ConstType;
        if(ConstType!=null) ConstType.setParent(this);
        this.ConstTypeList=ConstTypeList;
        if(ConstTypeList!=null) ConstTypeList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public ConstType getConstType() {
        return ConstType;
    }

    public void setConstType(ConstType ConstType) {
        this.ConstType=ConstType;
    }

    public ConstTypeList getConstTypeList() {
        return ConstTypeList;
    }

    public void setConstTypeList(ConstTypeList ConstTypeList) {
        this.ConstTypeList=ConstTypeList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstType!=null) ConstType.accept(visitor);
        if(ConstTypeList!=null) ConstTypeList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstType!=null) ConstType.traverseTopDown(visitor);
        if(ConstTypeList!=null) ConstTypeList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstType!=null) ConstType.traverseBottomUp(visitor);
        if(ConstTypeList!=null) ConstTypeList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclClass(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(ConstType!=null)
            buffer.append(ConstType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstTypeList!=null)
            buffer.append(ConstTypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclClass]");
        return buffer.toString();
    }
}
