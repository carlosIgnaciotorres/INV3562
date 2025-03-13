import java.util.Scanner;

public class TiendaSimulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0, precio;

        System.out.println("Ingrese el precio del producto (0 para finalizar):");
        precio = scanner.nextDouble();

        while (precio != 0) {
            total += precio;
            System.out.println("Ingrese el precio del producto (0 para finalizar):");
            precio = scanner.nextDouble();
        }
        scanner.close();

        System.out.println("El total a pagar es: " + total);
    }
}
