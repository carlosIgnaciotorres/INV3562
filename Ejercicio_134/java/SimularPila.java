import java.util.Scanner;
import java.util.Stack;

public class SimularPila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        
        while (true) {
            System.out.println("1. Apilar elemento");
            System.out.println("2. Desapilar elemento");
            System.out.println("3. Terminar");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Introduce el elemento a apilar: ");
                int elemento = scanner.nextInt();
                pila.push(elemento);
            } else if (opcion == 2) {
                if (!pila.isEmpty()) {
                    System.out.println("Elemento desapilado: " + pila.pop());
                } else {
                    System.out.println("Pila vacía");
                }
            } else if (opcion == 3) {
                System.out.println("Terminando programa...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }

        System.out.println("Estado final de la pila:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }

        scanner.close();
    }
}
