import java.util.Scanner;

public class CalcularCostoConIVA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor neto del producto: ");
        double valorNeto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de IVA: ");
        double porcentajeIVA = scanner.nextDouble();

        double iva = valorNeto * (porcentajeIVA / 100);
        double costoTotal = valorNeto + iva;

        System.out.println("El costo total del producto es: " + costoTotal);

        scanner.close();
    }
}
