import java.util.Scanner;

public class GenerarSecuencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, N, contador = 1;

        System.out.print("Ingrese el número base (X): ");
        X = scanner.nextInt();
        System.out.print("Ingrese el límite máximo (N): ");
        N = scanner.nextInt();

        while (X * contador <= N) {
            System.out.println(X * contador);
            contador++;
        }

        System.out.println("Secuencia generada correctamente.");
        scanner.close();
    }
}
