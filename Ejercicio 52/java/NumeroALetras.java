import java.util.Scanner;

public class NumeroALetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 9: ");
        int num = scanner.nextInt();
        String letras;

        if (num == 0) {
            letras = "cero";
        } else if (num == 1) {
            letras = "uno";
        } else if (num == 2) {
            letras = "dos";
        } else if (num == 3) {
            letras = "tres";
        } else if (num == 4) {
            letras = "cuatro";
        } else if (num == 5) {
            letras = "cinco";
        } else if (num == 6) {
            letras = "seis";
        } else if (num == 7) {
            letras = "siete";
        } else if (num == 8) {
            letras = "ocho";
        } else if (num == 9) {
            letras = "nueve";
        } else {
            letras = "El número está fuera del rango permitido";
        }

        System.out.println("El número en letras es: " + letras);
        scanner.close();
    }
}
