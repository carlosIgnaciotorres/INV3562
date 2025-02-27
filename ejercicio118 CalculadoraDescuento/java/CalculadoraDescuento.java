import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto de la compra: ");
        double montoCompra = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el tipo de cliente (Regular, Preferencial, Premium): ");
        String tipoCliente = scanner.nextLine();

        double porcentajeDescuento;

        if (tipoCliente.equalsIgnoreCase("Regular")) {
            porcentajeDescuento = 5;
        } else if (tipoCliente.equalsIgnoreCase("Preferencial")) {
            porcentajeDescuento = 10;
        } else if (tipoCliente.equalsIgnoreCase("Premium")) {
            porcentajeDescuento = 20;
        } else {
            porcentajeDescuento = 0;
        }

        double montoDescuento = montoCompra * (porcentajeDescuento / 100);
        double montoTotal = montoCompra - montoDescuento;

        System.out.println("El monto del descuento es: " + montoDescuento);
        System.out.println("El monto total a pagar es: " + montoTotal);

        scanner.close();
    }
}
