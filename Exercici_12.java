
import java.util.Scanner;

public class Exercici_12 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fraseScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per coneixer quantes lletres té, ignorant espais:");
        String frase = fraseScanner.nextLine();
        int total = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                total++;
            }
        }
        System.out.print("La frase té " + total + " lletres.");
        fraseScanner.close();
    }
}
