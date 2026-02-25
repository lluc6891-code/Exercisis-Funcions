import java.util.Scanner;

public class Exercici_14 {
  @SuppressWarnings("ConvertToTryWithResources")
  public static void main(String[] args) {
    // El último dígito (dígito de control) se calcula dividiendo el número del DNI
    // entre 23.
    // El resto de la división (operación normalmente conocida como módulo)
    // indicará la letra que debe ocupar la posición 9 del string.
    Scanner dniScanner = new Scanner(System.in);
    System.out.println("Introdueix el DNI a validar:");
    String LletresCorrectes = "TRWAGMYFPDXBNJZSQVHLCKE";
    String dni = dniScanner.nextLine();
    if (dni.length() == 9) {
      for (int i = 0; i < dni.length() - 1; i++) { // T R W A G M Y F P D X B N J Z S Q V H L C K E
        if (dni.charAt(i) == '0' ||
            dni.charAt(i) == '1' ||
            dni.charAt(i) == '2' ||
            dni.charAt(i) == '3' ||
            dni.charAt(i) == '4' ||
            dni.charAt(i) == '5' ||
            dni.charAt(i) == '6' ||
            dni.charAt(i) == '7' ||
            dni.charAt(i) == '8' ||
            dni.charAt(i) == '9') {
        } else {
          System.out.println("Error! El text introduit no és un DNI. Ha de tenir 9 caràcters, 8 nombres i una lletra.");
        }
      }
      if (dni.charAt(9) == 'T' ||
          dni.charAt(9) == 'R' ||
          dni.charAt(9) == 'W' ||
          dni.charAt(9) == 'A' ||
          dni.charAt(9) == 'G' ||
          dni.charAt(9) == 'M' ||
          dni.charAt(9) == 'Y' ||
          dni.charAt(9) == 'F' ||
          dni.charAt(9) == 'P' ||
          dni.charAt(9) == 'D' ||
          dni.charAt(9) == 'X' ||
          dni.charAt(9) == 'B' ||
          dni.charAt(9) == 'N' ||
          dni.charAt(9) == 'J' ||
          dni.charAt(9) == 'Z' ||
          dni.charAt(9) == 'S' ||
          dni.charAt(9) == 'Q' ||
          dni.charAt(9) == 'V' ||
          dni.charAt(9) == 'H' ||
          dni.charAt(9) == 'L' ||
          dni.charAt(9) == 'C' ||
          dni.charAt(9) == 'K' ||
          dni.charAt(9) == 'E') {
        String subdni = dni.substring(1, 8);
        int valorDni = Integer.parseInt(subdni);
        int lletra = valorDni % 23;
        if (LletresCorrectes.charAt(lletra) == dni.charAt(9)) {
          System.out.println("El DNI és correcte!");
        } else {
          System.out.println("Error! La lletra no coincideix!");
        }
      }

    } else {
      System.out.println("Error! El darrer caràcter no és una lletra!");
    }
    dniScanner.close();
  }
}