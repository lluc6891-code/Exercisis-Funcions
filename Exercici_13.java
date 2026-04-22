
import java.util.Scanner;

public class Exercici_13 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fraseScanner = new Scanner(System.in);
        System.out.println("Introdueix una frase per coneixer quantes vocals té:");
        String frase = fraseScanner.nextLine();
        int total = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u'
                    || frase.charAt(i) == 'A'
                    || frase.charAt(i) == 'E'
                    || frase.charAt(i) == 'I'
                    || frase.charAt(i) == 'O'
                    || frase.charAt(i) == 'U'
                    || frase.charAt(i) == 'à'
                    || frase.charAt(i) == 'é'
                    || frase.charAt(i) == 'è'
                    || frase.charAt(i) == 'í'
                    || frase.charAt(i) == 'ó'
                    || frase.charAt(i) == 'ò'
                    || frase.charAt(i) == 'ù'
                    || frase.charAt(i) == 'À'
                    || frase.charAt(i) == 'È'
                    || frase.charAt(i) == 'É'
                    || frase.charAt(i) == 'Í'
                    || frase.charAt(i) == 'Ó'
                    || frase.charAt(i) == 'Ò'
                    || frase.charAt(i) == 'Ù') {
                total++;
            } // Comprova si és una vocal, incloent-hi les majùscules i amb accents.
            // Per alguna raó no compta els accents.
        }
        System.out.print("La frase té " + total + " vocals.");
        fraseScanner.close();
    }
}
