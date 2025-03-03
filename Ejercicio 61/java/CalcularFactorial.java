import java.util.Scanner;

public class CalcularFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número entero positivo: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Error: El número debe ser un entero positivo.");
        } else {
            int factorial = 1;
            int contador = 1;

            while (contador <= n) {
                factorial *= contador;
                contador++;
            }

            System.out.println("El factorial de " + n + " es: " + factorial);
        }
        
        scanner.close();
    }
}
