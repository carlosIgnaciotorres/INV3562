import java.util.Scanner;

public class LeerNumeroEImprimir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        // Calcular el triple y el cubo
        double triple = numero * 3;
        double cubo = Math.pow(numero, 3);

        // Imprimir los resultados
        System.out.println("El triple del número es: " + triple);
        System.out.println("El cubo del número es: " + cubo);

        scanner.close();
    }
}
