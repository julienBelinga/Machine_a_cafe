
public class CBoisson {
    
    private String nom; // désignation de la boisson
    private int prix; // en centimes d'euros
    private boolean sansSucre; // TRUE si la boisson est sans sucre
    private int qte; // quantité en cl
    
    public CBoisson(){
        nom = "non défini";
        prix = 0;
        sansSucre = false;
        qte = 0;
    }

    public CBoisson(String nom, int prix, boolean sansSucre, int qte){
        this.nom = nom;
        this.prix = prix;
        this.sansSucre = sansSucre;
        this.qte = qte;
    }
    
    public String getNom() { return this.nom; }
    public int getPrix() { return this.prix; }
    public boolean getSansSucre() { return this.sansSucre; }
    
    public void afficher(){
        
        System.out.print(nom + " (" + qte + "cl.) : " + prix + "Cts d'euro.");
        if(sansSucre)
            System.out.print(" | SANS SUCRE");
        System.out.println("");
    }
}
