// generated with ast extension for cup
// version 0.8
// 16/0/2024 17:6:58


package rs.ac.bg.etf.pp1.ast;

public class NamespaceClass extends Namespace {

    private NamespaceName NamespaceName;
    private DeclList DeclList;
    private MethodDeclList MethodDeclList;
    private EndOfNamespace EndOfNamespace;

    public NamespaceClass (NamespaceName NamespaceName, DeclList DeclList, MethodDeclList MethodDeclList, EndOfNamespace EndOfNamespace) {
        this.NamespaceName=NamespaceName;
        if(NamespaceName!=null) NamespaceName.setParent(this);
        this.DeclList=DeclList;
        if(DeclList!=null) DeclList.setParent(this);
        this.MethodDeclList=MethodDeclList;
        if(MethodDeclList!=null) MethodDeclList.setParent(this);
        this.EndOfNamespace=EndOfNamespace;
        if(EndOfNamespace!=null) EndOfNamespace.setParent(this);
    }

    public NamespaceName getNamespaceName() {
        return NamespaceName;
    }

    public void setNamespaceName(NamespaceName NamespaceName) {
        this.NamespaceName=NamespaceName;
    }

    public DeclList getDeclList() {
        return DeclList;
    }

    public void setDeclList(DeclList DeclList) {
        this.DeclList=DeclList;
    }

    public MethodDeclList getMethodDeclList() {
        return MethodDeclList;
    }

    public void setMethodDeclList(MethodDeclList MethodDeclList) {
        this.MethodDeclList=MethodDeclList;
    }

    public EndOfNamespace getEndOfNamespace() {
        return EndOfNamespace;
    }

    public void setEndOfNamespace(EndOfNamespace EndOfNamespace) {
        this.EndOfNamespace=EndOfNamespace;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(NamespaceName!=null) NamespaceName.accept(visitor);
        if(DeclList!=null) DeclList.accept(visitor);
        if(MethodDeclList!=null) MethodDeclList.accept(visitor);
        if(EndOfNamespace!=null) EndOfNamespace.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(NamespaceName!=null) NamespaceName.traverseTopDown(visitor);
        if(DeclList!=null) DeclList.traverseTopDown(visitor);
        if(MethodDeclList!=null) MethodDeclList.traverseTopDown(visitor);
        if(EndOfNamespace!=null) EndOfNamespace.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(NamespaceName!=null) NamespaceName.traverseBottomUp(visitor);
        if(DeclList!=null) DeclList.traverseBottomUp(visitor);
        if(MethodDeclList!=null) MethodDeclList.traverseBottomUp(visitor);
        if(EndOfNamespace!=null) EndOfNamespace.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NamespaceClass(\n");

        if(NamespaceName!=null)
            buffer.append(NamespaceName.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DeclList!=null)
            buffer.append(DeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodDeclList!=null)
            buffer.append(MethodDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(EndOfNamespace!=null)
            buffer.append(EndOfNamespace.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [NamespaceClass]");
        return buffer.toString();
    }
}
