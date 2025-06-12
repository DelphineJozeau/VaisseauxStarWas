public class Intercepteur extends Vaisseau {
    //classe fille

    private static Integer nombreCanon;
    private Integer nombreTirs;

    //constructeurs
    public Intercepteur (String nom, double taille, Integer nombreCanon) {
        super(nom, taille);
        this.nombreCanon = nombreCanon;
        this.nombreTirs = 0;
    }


//methode pour tirer puis recharger les canons
    public void tirer() {
        nombreTirs += 1;
        if (nombreTirs > 2){System.out.println("Recharge");}
        else { System.out.println("Tire!");}
    }

    public void recharger() {
        nombreTirs = 0;
        System.out.println("Canons chargés");
}

    public static String getCapacite(){
        return "Ce croiseur a "+ nombreCanon +" canons ";
    }

}
