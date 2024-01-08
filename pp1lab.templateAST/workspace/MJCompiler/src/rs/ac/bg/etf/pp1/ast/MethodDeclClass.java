// generated with ast extension for cup
// version 0.8
// 8/0/2024 15:53:9


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclClass extends MethodDecl {

    private TypeList TypeList;
    private String I2;
    private FormParsOpt FormParsOpt;
    private MethodDeclVarList MethodDeclVarList;
    private StatementList StatementList;

    public MethodDeclClass (TypeList TypeList, String I2, FormParsOpt FormParsOpt, MethodDeclVarList MethodDeclVarList, StatementList StatementList) {
        this.TypeList=TypeList;
        if(TypeList!=null) TypeList.setParent(this);
        this.I2=I2;
        this.FormParsOpt=FormParsOpt;
        if(FormParsOpt!=null) FormParsOpt.setParent(this);
        this.MethodDeclVarList=MethodDeclVarList;
        if(MethodDeclVarList!=null) MethodDeclVarList.setParent(this);
        this.StatementList=StatementList;
        if(StatementList!=null) StatementList.setParent(this);
    }

    public TypeList getTypeList() {
        return TypeList;
    }

    public void setTypeList(TypeList TypeList) {
        this.TypeList=TypeList;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public FormParsOpt getFormParsOpt() {
        return FormParsOpt;
    }

    public void setFormParsOpt(FormParsOpt FormParsOpt) {
        this.FormParsOpt=FormParsOpt;
    }

    public MethodDeclVarList getMethodDeclVarList() {
        return MethodDeclVarList;
    }

    public void setMethodDeclVarList(MethodDeclVarList MethodDeclVarList) {
        this.MethodDeclVarList=MethodDeclVarList;
    }

    public StatementList getStatementList() {
        return StatementList;
    }

    public void setStatementList(StatementList StatementList) {
        this.StatementList=StatementList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(TypeList!=null) TypeList.accept(visitor);
        if(FormParsOpt!=null) FormParsOpt.accept(visitor);
        if(MethodDeclVarList!=null) MethodDeclVarList.accept(visitor);
        if(StatementList!=null) StatementList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(TypeList!=null) TypeList.traverseTopDown(visitor);
        if(FormParsOpt!=null) FormParsOpt.traverseTopDown(visitor);
        if(MethodDeclVarList!=null) MethodDeclVarList.traverseTopDown(visitor);
        if(StatementList!=null) StatementList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(TypeList!=null) TypeList.traverseBottomUp(visitor);
        if(FormParsOpt!=null) FormParsOpt.traverseBottomUp(visitor);
        if(MethodDeclVarList!=null) MethodDeclVarList.traverseBottomUp(visitor);
        if(StatementList!=null) StatementList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclClass(\n");

        if(TypeList!=null)
            buffer.append(TypeList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(FormParsOpt!=null)
            buffer.append(FormParsOpt.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclVarList!=null)
            buffer.append(MethodDeclVarList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(StatementList!=null)
            buffer.append(StatementList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclClass]");
        return buffer.toString();
    }
}