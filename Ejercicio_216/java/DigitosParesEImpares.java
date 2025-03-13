import java.util.Scanner;

public class DigitosParesEImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();
        int pares = 0, impares = 0;

        while (N > 0) {
            int digito = N % 10;
            if (digito % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            N /= 10;
        }

        if (pares == impares) {
            System.out.println("El número tiene la misma cantidad de dígitos pares e impares.");
        } else {
            System.out.println("El número NO tiene la misma cantidad de dígitos pares e impares.");
        }

        scanner.close();
    }
}
