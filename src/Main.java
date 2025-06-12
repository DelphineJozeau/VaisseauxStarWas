//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //création d'un nouvel intercepteur
        Intercepteur Xwing = new Intercepteur("X-wing",12.5, 2);
        Xwing.tirer();
        Xwing.tirer();
        Xwing.tirer();

        Xwing.recharger();

        //création d'un nouveau croiseur
        Croiseur acclamator = new Croiseur("Acclamator", 752, 700);
        acclamator.chargerHommes(600);
        acclamator.chargerHommes(200);

        afficherInfoVaisseau(Xwing);
        afficherInfoVaisseau(acclamator);
    }


    public static void afficherInfoVaisseau(Vaisseau vaisseau) {
        if (vaisseau instanceof Croiseur) {
            System.out.println(Croiseur.getCapacite());
        } else if (vaisseau instanceof Intercepteur) {
            System.out.println(Intercepteur.getCapacite());
        }
    }

}


