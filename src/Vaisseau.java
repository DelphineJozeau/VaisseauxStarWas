public class Vaisseau {
    //Classe Mère

    private String nom;
    private double taille;

    //constructeur : pour la création de l'objet
    public Vaisseau(String nom, double taille) {
        this.nom = nom;
        this.taille = taille;
    }

    public String getNom() {
        return nom;
    }

    public Double getTaille() {
        return taille;
    }

}

