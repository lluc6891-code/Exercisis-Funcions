
import java.util.Scanner;

public class Exercici_15 {

    public static int verificacioPangrama(int correcte, String frase, int[] llista) {
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            int posicio = (int) caracter - 65;
            llista[posicio] = 1;
        }
        for (int i = 0; i < llista.length; i++) {
            if (llista[i] == 0) {
                correcte = 0;
            }
        }
        return correcte;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int correcte = 1;
        Scanner fraseScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per veure si és un pangrama:");
        String frase = fraseScanner.nextLine().toUpperCase();
        int[] llista = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // String Lletres = "ABCDEFGHIJKLMOPQRSTUVWXYZ";

        fraseScanner.close();
        switch (verificacioPangrama(correcte, frase, llista)) {
            case 1:
                System.out.println("La frase introduida és un panagrama!");
                break;
            default:
                System.out.println("Error! No conté tots els caràcters!");
                break;
        }
    }
}
