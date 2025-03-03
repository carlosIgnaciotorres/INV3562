import java.util.Scanner;

public class ControlDeInventario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del artículo: ");
        String articulo = sc.nextLine();
        System.out.print("Ingresa la cantidad inicial de stock: ");
        int stock = sc.nextInt();

        while (true) {
            System.out.println("Opciones:");
            System.out.println("1. Registrar venta");
            System.out.println("2. Registrar compra");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.print("Ingresa la cantidad vendida: ");
                int cantidad = sc.nextInt();
                if (cantidad <= stock) {
                    stock -= cantidad;
                } else {
                    System.out.println("No hay suficiente stock.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingresa la cantidad comprada: ");
                int cantidad = sc.nextInt();
                stock += cantidad;
            } else if (opcion == 3) {
                System.out.println("Saliendo del sistema.");
                break;
            } else {
                System.out.println("Opción no válida.");
            }

            System.out.println("Stock actual de " + articulo + ": " + stock);
        }
    }
}
