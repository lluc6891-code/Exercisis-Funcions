import java.util.Scanner;

public class Exercici_8 {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner num1Scanner = new Scanner(System.in);
    Scanner num2Scanner = new Scanner(System.in);
    Scanner num3Scanner = new Scanner(System.in);
    System.out.println("Introdueix el primer nombre per calcular la mitjana:");
    int num1 = num1Scanner.nextInt();
    System.out.println("Introdueix el segon nombre per calcular la mitjana:");
    int num2 = num2Scanner.nextInt();
    System.out.println("Introdueix el tercer nombre per calcular la mitjana:");
    int num3 = num3Scanner.nextInt();
    System.out.println("La mitjana és: " + calcular(num1, num2, num3));
    num1Scanner.close();
    num2Scanner.close();
    num3Scanner.close();
  }

  public static int calcular(int num1, int num2, int num3) {
    int resultat = (num1 + num2 + num3) / 3;
    return resultat;
  }
}
