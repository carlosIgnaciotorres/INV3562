import java.util.Scanner;

public class ControlarDivisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();

        double divisor;
        do {
            System.out.print("Ingrese el divisor (distinto de 0): ");
            divisor = scanner.nextDouble();
        } while (divisor == 0);

        double resultado = dividendo / divisor;
        System.out.println("El resultado de la división es: " + resultado);

        scanner.close();
    }
}
