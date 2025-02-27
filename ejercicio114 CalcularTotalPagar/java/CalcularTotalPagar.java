import java.util.Scanner;

public class CalcularTotalPagar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de unidades: ");
        double cantidadUnidades = scanner.nextDouble();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        double total = cantidadUnidades * precioUnitario;

        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
