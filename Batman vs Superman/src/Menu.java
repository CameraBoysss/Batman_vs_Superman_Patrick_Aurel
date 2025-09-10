public class Menu {
    private TesterEntrees tester;
    private boolean continuer = true;

    public Menu() {
        tester = new TesterEntrees(new Grille());
    }

    public void start() {
        while (continuer) {
            Terminal.displayMainMenu();
            System.out.println("Votre choix: ");
            int choix = IntReader.readIntBetween(1, 3);

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