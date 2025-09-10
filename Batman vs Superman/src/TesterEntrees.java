import java.util.Scanner;

public class TesterEntrees {
    Scanner sc = new Scanner(System.in);
    private Grille grille;
    private int ligneSelectionnee;
    private int colonneSelectionnee;


    public TesterEntrees(Grille grille) {
        this.grille = grille;
    }

    public void validerRemplissageLigne(){

        System.out.println("Veillez entrer le numéro de la ligne");
        grille.setNumeroLigne(IntReader.read());
        while (grille.getNumeroLigne() < 0 || grille.getNumeroLigne() > 3) {
            System.out.println("Veillez entrer un numéro de ligne correct entre 0 et 3");
            sc.nextLine();

            grille.setNumeroLigne(IntReader.read());
        }
    }

    public void validerRemplissageColonne(){
        grille.getNumeroColonne();
        System.out.println("Veillez entrer le numéro de la colonne");
        grille.setNumeroColonne(IntReader.read());
        while (grille.getNumeroColonne() < 0 || grille.getNumeroLigne() > 3) {
            System.out.println("Veillez entrer un numéro de ligne correct entre 0 et 3");
            sc.nextLine();
            grille.setNumeroColonne(IntReader.read());
        }
    }

    public void validerPosition() {
     do    {
            validerRemplissageLigne();
            validerRemplissageColonne();
             if (grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != ' '){
                 System.out.println("Cette case est déja occupée, veillez en choisir une autre svp");
             }
        } while(grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != ' ');

    }

    public void validerPosionHeatVision () {
        do    {
            validerRemplissageLigne();
            validerRemplissageColonne();
            if (grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != 'B'){
                System.out.println("Veillez choisir une case occupé par Batman svp");
            }
        } while(grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != 'B');

    }

    public void validerPositionTactician() {
        do {
            validerRemplissageLigne();
            validerRemplissageColonne();
            if (grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != 'S') {
                System.out.println("Veuillez choisir une case occupée par Superman s'il vous plaît.");
            } else {
                ligneSelectionnee = grille.getNumeroLigne();
                 colonneSelectionnee = grille.getNumeroColonne();
                return;
            }
        } while (grille.getGrille()[grille.getNumeroLigne()][grille.getNumeroColonne()] != 'S');
    }



    public int getLigneSelectionnee() {
        return ligneSelectionnee;
    }

    public int getColonneSelectionnee() {
        return colonneSelectionnee;
    }

}
