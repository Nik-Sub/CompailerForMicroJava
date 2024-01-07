// generated with ast extension for cup
// version 0.8
// 7/0/2024 20:54:46


package rs.ac.bg.etf.pp1.ast;

public class DecClass extends ListExpressions {

    private Dec Dec;

    public DecClass (Dec Dec) {
        this.Dec=Dec;
        if(Dec!=null) Dec.setParent(this);
    }

    public Dec getDec() {
        return Dec;
    }

    public void setDec(Dec Dec) {
        this.Dec=Dec;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Dec!=null) Dec.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Dec!=null) Dec.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Dec!=null) Dec.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DecClass(\n");

        if(Dec!=null)
            buffer.append(Dec.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DecClass]");
        return buffer.toString();
    }
}
