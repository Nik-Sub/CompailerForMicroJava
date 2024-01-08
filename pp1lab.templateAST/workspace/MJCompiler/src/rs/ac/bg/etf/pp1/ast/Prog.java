// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class Prog extends Program {

    private String I1;
    private Namespaces Namespaces;
    private DeclList DeclList;
    private NamespaceList NamespaceList;

    public Prog (String I1, Namespaces Namespaces, DeclList DeclList, NamespaceList NamespaceList) {
        this.I1=I1;
        this.Namespaces=Namespaces;
        if(Namespaces!=null) Namespaces.setParent(this);
        this.DeclList=DeclList;
        if(DeclList!=null) DeclList.setParent(this);
        this.NamespaceList=NamespaceList;
        if(NamespaceList!=null) NamespaceList.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public Namespaces getNamespaces() {
        return Namespaces;
    }

    public void setNamespaces(Namespaces Namespaces) {
        this.Namespaces=Namespaces;
    }

    public DeclList getDeclList() {
        return DeclList;
    }

    public void setDeclList(DeclList DeclList) {
        this.DeclList=DeclList;
    }

    public NamespaceList getNamespaceList() {
        return NamespaceList;
    }

    public void setNamespaceList(NamespaceList NamespaceList) {
        this.NamespaceList=NamespaceList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Namespaces!=null) Namespaces.accept(visitor);
        if(DeclList!=null) DeclList.accept(visitor);
        if(NamespaceList!=null) NamespaceList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Namespaces!=null) Namespaces.traverseTopDown(visitor);
        if(DeclList!=null) DeclList.traverseTopDown(visitor);
        if(NamespaceList!=null) NamespaceList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Namespaces!=null) Namespaces.traverseBottomUp(visitor);
        if(DeclList!=null) DeclList.traverseBottomUp(visitor);
        if(NamespaceList!=null) NamespaceList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Prog(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(Namespaces!=null)
            buffer.append(Namespaces.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DeclList!=null)
            buffer.append(DeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NamespaceList!=null)
            buffer.append(NamespaceList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Prog]");
        return buffer.toString();
    }
}
