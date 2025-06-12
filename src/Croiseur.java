public class Croiseur extends Vaisseau {
    //herite de Vaisseau
    //attribut particulier de Croiseur

    private Integer capaciteHommes;
    private Integer nbrHommesABord;

    //constructeurs
    public Croiseur ( String nom, double taille, Integer capaciteHommes){
        super(nom, taille);
        this.capaciteHommes = capaciteHommes;
        this.nbrHommesABord = 0;
    }

    //méthode
    public void chargerHommes(Integer nbrHommesCharge) {
        if( nbrHommesCharge + nbrHommesABord <= capaciteHommes ){
            nbrHommesABord += nbrHommesCharge;
            System.out.println("Tous les hommes sont à bord !");
        }
        else { System.out.println("Trop de monde là dedans !"); }

    }

    public void dechargerHommes(int nbrHommesAdecharger){

    }

    public String getType(){
        return "Croiseur";
    }

    public static String getCapacite(){
        return "Ce croiseur peut charger des gens";
    }
}
