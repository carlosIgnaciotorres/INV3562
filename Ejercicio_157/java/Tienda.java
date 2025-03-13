import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        
        double total = 0;
        
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            String producto = scanner.next();
            
            System.out.print("Ingresa el precio de " + producto + ": ");
            double precio = scanner.nextDouble();
            
            total += precio;
        }
        
        System.out.println("El total de la compra es: " + total);
    }
}