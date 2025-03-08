public class CompteCourant extends Compte{
    private double decouvert;
    public CompteCourant(double solde, double decouvert){
        super(solde);
        this.decouvert=decouvert;
    }

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        this.decouvert = decouvert;
    }

    public void retirer(double mt){
        if(solde+decouvert>=mt)
            solde=solde-mt;
        else System.out.println(("Retrait refusé"));
    }
public String toString(){
        return super.toString()+"le découvert est"+decouvert;
}
}
