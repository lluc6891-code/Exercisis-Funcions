
import java.util.Scanner;

public class Exercici_11 {

    public static int calcular(int numF1, int numF2, int i, int comptador) {
        // Prepara el següent pas.
        while (i < comptador) {

            //  Prepara el següent pas.
            int numF3 = numF1 + numF2;
            numF1 = numF2;
            numF2 = numF3;
            System.out.println(numF1 + " ");
            i++;
        }
        return numF1;
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner fibonacciScanner = new Scanner(System.in);
        System.out.println("Introdueix un nombre per coneixer la llargaria de la Successio de Fibonacci:");
        int comptador = fibonacciScanner.nextInt();
        int i = 0;
        int numF1 = 0;
        int numF2 = 1;

        System.out.print(calcular(numF1, numF2, i, comptador) + " ");

        fibonacciScanner.close();

    }
}
