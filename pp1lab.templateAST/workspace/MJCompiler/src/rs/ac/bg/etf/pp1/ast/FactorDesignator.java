// generated with ast extension for cup
// version 0.8
// 8/0/2024 13:12:33


package rs.ac.bg.etf.pp1.ast;

public class FactorDesignator extends Factor {

    private Designator Designator;
    private FactorDesPrime FactorDesPrime;

    public FactorDesignator (Designator Designator, FactorDesPrime FactorDesPrime) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.FactorDesPrime=FactorDesPrime;
        if(FactorDesPrime!=null) FactorDesPrime.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public FactorDesPrime getFactorDesPrime() {
        return FactorDesPrime;
    }

    public void setFactorDesPrime(FactorDesPrime FactorDesPrime) {
        this.FactorDesPrime=FactorDesPrime;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(FactorDesPrime!=null) FactorDesPrime.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(FactorDesPrime!=null) FactorDesPrime.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(FactorDesPrime!=null) FactorDesPrime.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorDesignator(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FactorDesPrime!=null)
            buffer.append(FactorDesPrime.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorDesignator]");
        return buffer.toString();
    }
}
