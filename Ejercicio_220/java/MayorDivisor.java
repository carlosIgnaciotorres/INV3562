import java.util.Scanner;

public class MayorDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();
        int mayorDivisor = 1;

        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                mayorDivisor = i;
            }
        }

        System.out.println("El mayor divisor distinto de sí mismo es: " + mayorDivisor);
        scanner.close();
    }
}
