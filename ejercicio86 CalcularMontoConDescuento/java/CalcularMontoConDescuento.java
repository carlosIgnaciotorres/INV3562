import java.util.Scanner;

public class CalcularMontoConDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el monto de la compra: ");
        double montoCompra = scanner.nextDouble();
        double montoFinal;
        if (montoCompra > 1000) {
            double descuento = montoCompra * 0.20;
            montoFinal = montoCompra - descuento;
        } else {
            montoFinal = montoCompra;
        }
        System.out.printf("El monto total a pagar es: %.2f%n", montoFinal);
    }
}
