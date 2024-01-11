// generated with ast extension for cup
// version 0.8
// 11/0/2024 13:16:24


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclVarListClass extends MethodDeclVarList {

    private MethodDeclVarList MethodDeclVarList;
    private VarDecl VarDecl;

    public MethodDeclVarListClass (MethodDeclVarList MethodDeclVarList, VarDecl VarDecl) {
        this.MethodDeclVarList=MethodDeclVarList;
        if(MethodDeclVarList!=null) MethodDeclVarList.setParent(this);
        this.VarDecl=VarDecl;
        if(VarDecl!=null) VarDecl.setParent(this);
    }

    public MethodDeclVarList getMethodDeclVarList() {
        return MethodDeclVarList;
    }

    public void setMethodDeclVarList(MethodDeclVarList MethodDeclVarList) {
        this.MethodDeclVarList=MethodDeclVarList;
    }

    public VarDecl getVarDecl() {
        return VarDecl;
    }

    public void setVarDecl(VarDecl VarDecl) {
        this.VarDecl=VarDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodDeclVarList!=null) MethodDeclVarList.accept(visitor);
        if(VarDecl!=null) VarDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodDeclVarList!=null) MethodDeclVarList.traverseTopDown(visitor);
        if(VarDecl!=null) VarDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodDeclVarList!=null) MethodDeclVarList.traverseBottomUp(visitor);
        if(VarDecl!=null) VarDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclVarListClass(\n");

        if(MethodDeclVarList!=null)
            buffer.append(MethodDeclVarList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDecl!=null)
            buffer.append(VarDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclVarListClass]");
        return buffer.toString();
    }
}
