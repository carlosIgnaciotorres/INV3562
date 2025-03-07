import java.util.Scanner;

public class TotalConDescuento {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();
        
        
        double descuento = 15;
        
        
        double montoDescuento = totalCompra * (descuento / 100);
        
        
        double totalFinal = totalCompra - montoDescuento;
        
        
        System.out.printf("El total a pagar después del descuento del %.2f%% es: %.2f%n", descuento, totalFinal);
        
        
        scanner.close();
    }
}
