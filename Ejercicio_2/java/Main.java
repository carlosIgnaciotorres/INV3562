import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + "! Bienvenido.");
        
        scanner.close(); // Cerramos el scanner para liberar recursos
    }
}
