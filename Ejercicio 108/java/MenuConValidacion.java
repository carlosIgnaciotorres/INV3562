import java.util.Scanner;

public class MenuConValidacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Opción 4");
            System.out.println("5. Opción 5");
            
            System.out.print("Selecciona una opción (1-5): ");
            opcion = sc.nextInt();
            
            if (opcion >= 1 && opcion <= 5) {
                System.out.println("Opción seleccionada: " + opcion);
            } else {
                System.out.println("Opción inválida. Por favor, selecciona una opción entre 1 y 5.");
            }
        } while (opcion < 1 || opcion > 5);
    }
}
