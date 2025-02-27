import java.util.LinkedList;
import java.util.Scanner;

public class SimularCola {
    public static void main(String[] args) {
        LinkedList<String> cola = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar persona a la fila");
            System.out.println("2. Sacar persona de la fila");
            System.out.println("3. Terminar");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cola.add("Persona");  // Añadir una persona a la cola
                    System.out.println("Una persona ha sido añadida a la fila.");
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        cola.remove();  // Sacar a la persona del frente de la cola
                        System.out.println("Una persona ha sido sacada de la fila.");
                    } else {
                        System.out.println("La fila está vacía. No hay nadie para sacar.");
                    }
                    break;
                case 3:
                    System.out.println("Finalizando el programa...");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}
