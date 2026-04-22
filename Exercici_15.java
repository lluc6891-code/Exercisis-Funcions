import java.util.Scanner;

public class Exercici_15 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fraseScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per coneixer quantes vocals té:");
        String frase = fraseScanner.nextLine().toUpperCase();
        int[] llista = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        // String Lletres = "ABCDEFGHIJKLMOPQRSTUVWXYZ";
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            int posicio = (int) caracter - 65;
            llista[posicio] = 1;
        }
        boolean correcte = true;
        for (int i = 0; i < llista.length; i++) {
            if (llista[i] == 0) {
                correcte = false;
            }
        }
        if (correcte) {
            System.out.println("Error! No conté tots els caràcters!");
        } else {
            System.out.println("La frase introduida és un panagrama!");
        }
        fraseScanner.close();
    }
}