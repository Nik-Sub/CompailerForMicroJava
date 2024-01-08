// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class Namespaces1 extends Namespaces {

    private Namespaces Namespaces;
    private Namespace Namespace;

    public Namespaces1 (Namespaces Namespaces, Namespace Namespace) {
        this.Namespaces=Namespaces;
        if(Namespaces!=null) Namespaces.setParent(this);
        this.Namespace=Namespace;
        if(Namespace!=null) Namespace.setParent(this);
    }

    public Namespaces getNamespaces() {
        return Namespaces;
    }

    public void setNamespaces(Namespaces Namespaces) {
        this.Namespaces=Namespaces;
    }

    public Namespace getNamespace() {
        return Namespace;
    }

    public void setNamespace(Namespace Namespace) {
        this.Namespace=Namespace;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Namespaces!=null) Namespaces.accept(visitor);
        if(Namespace!=null) Namespace.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Namespaces!=null) Namespaces.traverseTopDown(visitor);
        if(Namespace!=null) Namespace.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Namespaces!=null) Namespaces.traverseBottomUp(visitor);
        if(Namespace!=null) Namespace.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Namespaces1(\n");

        if(Namespaces!=null)
            buffer.append(Namespaces.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Namespace!=null)
            buffer.append(Namespace.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Namespaces1]");
        return buffer.toString();
    }
}
