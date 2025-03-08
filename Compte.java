public abstract class Compte {
    protected  int numerocompte;
    protected double solde;
    protected static int nbrecompte=0;

    public static int getNbrecompte() {
        return nbrecompte;
    }
    public static void setNbrecompte(int nbrecompte) {
        Compte.nbrecompte = nbrecompte;
    }

    public int getNumerocompte() {
        return numerocompte;
    }

    public void setNumerocompte(int numerocompte) {
        this.numerocompte = numerocompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void retirer(double mt){
        if(solde>=mt)
        this.solde=solde-mt;
        else System.out.println(("veuillez choisir un montant inférieur au solde"+solde));
    }
    public void deposer(double mt){
        this.solde=solde+mt;
    }
    public void virement(Compte c, double mt){
       this.retirer(mt);
        c.deposer(mt);
    }

    public Compte(double solde){
        this.solde=solde;
        this.numerocompte=++nbrecompte;
        sepresenter();
    }

    private void sepresenter() {
        System.out.println("je suis le compte"+numerocompte+"ayant le solde"+solde);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numerocompte=" + numerocompte +
                ", solde=" + solde +
                '}';
    }
}
