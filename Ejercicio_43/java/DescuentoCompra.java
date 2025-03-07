import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        
        double descuento = totalCompra * 0.15;
        double totalPagar = totalCompra - descuento;
        
        System.out.println("El total a pagar después del descuento es: " + totalPagar);
    }
}
