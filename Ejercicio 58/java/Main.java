import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa un número entero positivo: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Error: el número debe ser positivo.");
        } else {
            System.out.println("Múltiplos de 3 desde 1 hasta " + n + ":");
            int contador = 1;
            while (contador <= n) {
                if (contador % 3 == 0) {
                    System.out.println(contador);
                }
                contador++;
            }
        }
        scanner.close();
    }
}
