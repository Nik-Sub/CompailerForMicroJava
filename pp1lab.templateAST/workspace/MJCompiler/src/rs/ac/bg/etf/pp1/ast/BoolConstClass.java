// generated with ast extension for cup
// version 0.8
// 16/0/2024 12:17:26


package rs.ac.bg.etf.pp1.ast;

public class BoolConstClass extends Factor {

    private Boolconst Boolconst;

    public BoolConstClass (Boolconst Boolconst) {
        this.Boolconst=Boolconst;
        if(Boolconst!=null) Boolconst.setParent(this);
    }

    public Boolconst getBoolconst() {
        return Boolconst;
    }

    public void setBoolconst(Boolconst Boolconst) {
        this.Boolconst=Boolconst;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Boolconst!=null) Boolconst.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Boolconst!=null) Boolconst.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Boolconst!=null) Boolconst.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BoolConstClass(\n");

        if(Boolconst!=null)
            buffer.append(Boolconst.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BoolConstClass]");
        return buffer.toString();
    }
}
