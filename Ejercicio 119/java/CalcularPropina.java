import java.util.Scanner;

public class CalcularPropina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la cuenta: ");
        double montoCuenta = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de propina: ");
        double porcentajePropina = scanner.nextDouble();

        double propina = montoCuenta * (porcentajePropina / 100);
        double totalCuenta = montoCuenta + propina;

        System.out.println("El monto de la propina es: " + propina);
        System.out.println("El total a pagar es: " + totalCuenta);

        scanner.close();
    }
}
