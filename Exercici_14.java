
import java.util.Scanner;

public class Exercici_14 {

    public static int verificacioDni(String LletresCorrectes, String dni, int resultat) {
        if (dni.length() == 8) {
            for (int i = 0; i < dni.length() - 1; i++) { // T R W A G M Y F P D X B N J Z S Q V H L C K E
                if (dni.charAt(i) == '0'
                        || dni.charAt(i) == '1'
                        || dni.charAt(i) == '2'
                        || dni.charAt(i) == '3'
                        || dni.charAt(i) == '4'
                        || dni.charAt(i) == '5'
                        || dni.charAt(i) == '6'
                        || dni.charAt(i) == '7'
                        || dni.charAt(i) == '8'
                        || dni.charAt(i) == '9') {
                } else {
                    System.out.println("Error! El text introduit no és un DNI. Ha de tenir 9 caràcters, 8 nombres i una lletra.");
                }
            }
            if (dni.charAt(8) == 'T'
                    || dni.charAt(8) == 'R'
                    || dni.charAt(8) == 'W'
                    || dni.charAt(8) == 'A'
                    || dni.charAt(8) == 'G'
                    || dni.charAt(8) == 'M'
                    || dni.charAt(8) == 'Y'
                    || dni.charAt(8) == 'F'
                    || dni.charAt(8) == 'P'
                    || dni.charAt(8) == 'D'
                    || dni.charAt(8) == 'X'
                    || dni.charAt(8) == 'B'
                    || dni.charAt(8) == 'N'
                    || dni.charAt(8) == 'J'
                    || dni.charAt(8) == 'Z'
                    || dni.charAt(8) == 'S'
                    || dni.charAt(8) == 'Q'
                    || dni.charAt(8) == 'V'
                    || dni.charAt(8) == 'H'
                    || dni.charAt(8) == 'L'
                    || dni.charAt(8) == 'C'
                    || dni.charAt(8) == 'K'
                    || dni.charAt(8) == 'E') {
                String subdni = dni.substring(0, 7);
                int valorDni = Integer.parseInt(subdni);
                int lletra = valorDni % 23;
                if (LletresCorrectes.charAt(lletra) == dni.charAt(8)) {
                    resultat = 1;
                } else {
                    resultat = 0;
                }
            }

        } else {
            resultat = 0;
        }
        return resultat;
    }

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
        int resultat = 0;

        dniScanner.close();

        switch (verificacioDni(LletresCorrectes, dni, resultat)) {
            case 1:
                System.out.println("El DNI és correcte!");
                break;
            default:
                System.err.println("Error! El DNI no és correcte! Un DNI és una combinació de 8 nombres i una lletra. Per favor, intenta-ho una altra vegada.");
        }
    }
}
