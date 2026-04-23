
import java.util.Scanner;

public class Exercici_10 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner factorialScanner = new Scanner(System.in);
        System.out.println("Introdueix un nombre per coneixer el seu factorial:");
        int factorial = factorialScanner.nextInt();
        System.out.println("El factorial de " + factorial + " es: " + factorial(factorial));
        factorialScanner.close();

    }

    public static double factorial(int factorial) {
        int resultat = 1;
        for (int i = 1; i <= factorial; i++) { // Fa les multiplicacions una passa cada vegada, fins que arriba al factorial.
            resultat = resultat * i;
        }
        return resultat;
    }
}
