public class CompteEpargne extends Compte{
    private double taux;

    public CompteEpargne(double solde, double taux) {
        super(solde);
        this.taux=taux;
    }
    public void deposer(double mt){
        this.solde=solde+mt*taux;


    }
    public String toString(){
        return super.toString()+"le taux d'interet est"+taux;
    }
}
