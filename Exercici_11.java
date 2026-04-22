
import java.util.Scanner;

public class Exercici_11 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fibonacciScanner = new Scanner(System.in);
        System.out.println("Introdueix un nombre per coneixer la llargaria de la Successio de Fibonacci:");
        int comptador = fibonacciScanner.nextInt();
        int i = 0;
        int numF1 = 0;
        int numF2 = 1;
        while (i < comptador) {
            // Mostrar el nombre de la successió
            System.out.print(numF1 + " ");

            // Prepara el següent pas.
            int numF3 = numF2 + numF1;
            numF1 = numF2;
            numF2 = numF3;
            i++;
        }
        fibonacciScanner.close();
    }
}
