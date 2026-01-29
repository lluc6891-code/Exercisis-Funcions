import java.util.Scanner;

public class Exercici_9 {
  public static double convertToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
    return celsius;
  }

  public static double convertToFahrenheit(double celsius) {
    double fahrenheit = (celsius * 9.0 / 5.0) + 32;
    return fahrenheit;
  }

  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Scanner seleccioScanner = new Scanner(System.in);

    System.out.println(
        "Conversor de Temperatures, per convertir de ºF a ºC, introdueix 1. Per convertir de ºC a ºF, introdueix 2: ");
    int seleccio = seleccioScanner.nextInt();
    switch (seleccio) {
      case 1:
        System.out.println("Introdueix la temperatura a convertir de Fahrenheit a Celsius: ");
        double conversioF = scanner.nextDouble();
        System.out.println(convertToCelsius(conversioF));
        break;
      case 2:
        System.out.println("Introdueix la temperatura a convertir de Celsius a Fahrenheit: ");
        double conversioC = scanner.nextDouble();
        System.out.println(convertToFahrenheit(conversioC));
        break;
      default:
        System.out.println("Error! El nombre introdut no és ni 1 o 2!");
    }
    scanner.close();
    seleccioScanner.close();
  }
}