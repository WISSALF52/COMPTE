public class Main {
    public static void main(String[] args) {
        /*System.out.println(("le nombre de compte est" +Compte.getNbrecompte()));
        Compte cp=new Compte(1000);
        cp.setSolde(2000);
        System.out.println((cp));
        cp.retirer(3000);
        Compte cp1=new Compte(1000);
        cp1.setSolde(3000);
        System.out.println((cp1));
        Compte cp3=new Compte(1000);
        cp3.setSolde(2000);
        System.out.println((cp3));
        Compte cp4= new Compte(5000);
        System.out.println((cp4));
        System.out.println(("le nombre de compte est" +Compte.getNbrecompte()));
           cp4.retirer(400);
        System.out.println((cp4));
        cp3.virement(cp4,200);
        System.out.println(cp3);
        System.out.println(cp4);*/
        System.out.println("héritage---------------");
        CompteCourant cc=new CompteCourant(2000,500);
        System.out.println(cc);
        CompteEpargne ce=new CompteEpargne(1000,1.2);
        System.out.println(ce);



    }
}