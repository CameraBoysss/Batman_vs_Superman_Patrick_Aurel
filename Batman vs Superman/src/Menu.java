public class Menu {
    private TesterEntrees tester;
    private boolean continuer = true;

    public Menu() {
        tester = new TesterEntrees(new Grille());
    }

    public int afficherMenuPrincipal() {
        Terminal.displayMainMenu();
        System.out.println("Votre choix : ");

        return tester.choixMenuPrincipal();
    }

    public void start() {
        while (continuer) {
            int choix = afficherMenuPrincipal();
            if (choix < 1 || choix > 3) {
                System.out.println("Choix invalide, veuillez réassayer");
                continue;
            }

            if (choix == 3) {
                continuer = false;
                System.out.println("Au revoir");
                return;
            }

            launchGame(choix != 1);
        }
    }

    public void launchGame(boolean modeAI) {
        Game game = new Game(modeAI);
        game.jouer();
    }
}