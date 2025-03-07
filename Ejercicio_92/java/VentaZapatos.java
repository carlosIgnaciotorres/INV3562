import java.util.Scanner;

public class VentaZapatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el costo de las sandalias: ");
        double costoSandalias = scanner.nextDouble();

        System.out.print("Ingresa el costo de los tenis: ");
        double costoTenis = scanner.nextDouble();

        System.out.print("Ingresa el costo de los mocasines: ");
        double costoMocasines = scanner.nextDouble();

        System.out.print("Ingresa la cantidad de sandalias: ");
        int cantidadSandalias = scanner.nextInt();

        System.out.print("Ingresa la cantidad de tenis: ");
        int cantidadTenis = scanner.nextInt();

        System.out.print("Ingresa la cantidad de mocasines: ");
        int cantidadMocasines = scanner.nextInt();

        double precioSandalias = costoSandalias * 1.55;
        double precioTenis = costoTenis * 1.55;
        double precioMocasines = costoMocasines * 1.55;

        double valorSinDescuento = (cantidadSandalias * precioSandalias) + (cantidadTenis * precioTenis) + (cantidadMocasines * precioMocasines);
        double descuento = valorSinDescuento * 0.08;
        double valorConDescuento = valorSinDescuento - descuento;
        double ventaNetaFinal = valorConDescuento * 1.16;

        System.out.println("Nombre del cliente: " + nombre);
        System.out.printf("Valor sin descuento: %.2f%n", valorSinDescuento);
        System.out.printf("Descuento: %.2f%n", descuento);
        System.out.printf("Valor con descuento: %.2f%n", valorConDescuento);
        System.out.printf("Venta neta final: %.2f%n", ventaNetaFinal);
    }
}
