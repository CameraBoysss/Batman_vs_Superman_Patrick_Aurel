import java.util.Scanner;

public class IntReader {
    private static Scanner scanner = new Scanner(System.in);

    public static int read() {
        while(!scanner.hasNextInt()){
            System.out.println("Veillez entrer un nombre");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    public static int read(int min, int max) {
        int value = 0;
        do {
            value = read();
            if (value < min || value > max) {
                System.out.printf("Veuillez saisir une valeur à partir de %d jusqu'à %d.", min, max);
            }
        } while(value < min || value > max);
    return value;
    }
}