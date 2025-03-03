import java.util.Scanner;

public class MenuDeOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Realizar tarea 1");
            System.out.println("2. Realizar tarea 2");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Realizando tarea 1");
                    break;
                case 2:
                    System.out.println("Realizando tarea 2");
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        } while (opcion != 3);
    }
}
