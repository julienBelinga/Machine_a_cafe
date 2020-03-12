
import java.util.Scanner;
import java.util.ArrayList;

public class CDistributeur {

    ArrayList <CBoisson> boissons; // boissons proposées (8 maximum)
    private int credit; // monnaie insérée dans le distributeur (en centimes d'euros)
    private int sucre; // de 0 à 6 selon la dose souhaitée pour la boisson ('3' par défaut, ignoré pour les boissons sans sucre)

    public CDistributeur() {
        boissons = new ArrayList<CBoisson>();
        credit = 0;
        sucre = 3;
    }

    public void ajouterBoisson(CBoisson B) {

        boissons.add(B);
        System.out.println(" *** La boisson " + B.getNom() + " a été ajoutée au distributeur ***");
    }

    public void crediter(int somme) {
        credit += somme;
        System.out.println("Votre crédit : " + credit + " centimes d'euros");
    }
    
    public void enleverCredit(int somme) {
        if (credit == 0){
           System.out.println("essaye pas de douiller!");
        }
        else
            credit -= somme;
    }

    public void restituerMonnaie() {

        System.out.println("Le distributeur vous rend " + credit + " centimes d'euro.");
        credit = 0;
    }

    public void diminuerSucre() {
        if(sucre > 0) sucre--;
        System.out.println("Dose sucre : " + sucre);
    }
    
    public void augmenterSucre() {
        if(sucre < 6) sucre++;
        System.out.println("Dose sucre : " + sucre);
    }

    public void commanderBoisson() {

        // on affiche le menu
        this.afficher();
        System.out.println("Votre crédit : " + credit + " centimes d'euros");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Quelle boisson désirez vous ? ");

        int choix = sc.nextInt();

        commanderBoisson(choix);
    }

    public void commanderBoisson(int choix) {

        CBoisson B = boissons.get(choix - 1);

        if (B == null) {
            System.out.println("Il n'y a pas de boisson pour cette sélection.");
        } else if (B.getPrix() > credit) {
            System.out.println("Vous n'avez pas assez de monnaie pour commander cette boisson.");
        } else {
            System.out.print("...Préparation en cours votre boisson : ");
            B.afficher();
            
            System.out.print("Dosage sucre : ");
            if (B.getSansSucre()) System.out.println("0");
            else System.out.println(sucre);

            System.out.println("Votre boisson est prête !");
            System.out.println("Monnaie rendue : " + (credit - B.getPrix()) + "centimes d'euros.");
        }

    }

    public void afficher() {
        System.out.println("Le distributeur vous propose les boissons suivantes :");
        System.out.println("----------------------------------------------------");

        if (boissons.size() > 0) {
            
            for (int i = 0 ; i < boissons.size() ; i++) {
                System.out.print("Choix " + (i+1) + " > ");
                boissons.get(i).afficher();
            }
        }
        else {
            System.out.println("Aucune boisson disponible.\n");
        }

    }

    public int getCredit() {
        return credit;
    }

    public int getSucre() {
        return sucre;
    }
    
    
}
