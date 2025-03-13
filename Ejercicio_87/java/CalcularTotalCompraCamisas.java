import java.util.Scanner;

public class CalcularTotalCompraCamisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de camisas: ");
        int cantidadCamisas = scanner.nextInt();
        System.out.print("Ingresa el precio unitario de cada camisa: ");
        double precioUnitario = scanner.nextDouble();
        double precioTotal = cantidadCamisas * precioUnitario;
        double descuento;
        if (cantidadCamisas >= 3) {
            descuento = precioTotal * 0.20;
        } else {
            descuento = precioTotal * 0.10;
        }
        double totalAPagar = precioTotal - descuento;
        System.out.printf("El total a pagar es: %.2f%n", totalAPagar);
    }
}
