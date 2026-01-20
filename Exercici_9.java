import java.util.Scanner;
public class Exercici_9 {
  public static double convertToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * 5.0 / 9.0;
    return celsius;
  }
  public static double convertToFahrenheit(double celsius) {
    double fahrenheit = (celsius * 9.0 / 5.0) +32;
    return fahrenheit;
  }

  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Conversor de Temperatures");

    System.out.println("Introdueix la temperatura a convertir de Fahrenheit a Celsius: ");

    double fahrenheit = scanner.nextDouble();
    System.out.println(convertToCelsius(fahrenheit));
    scanner.close();
  }
}