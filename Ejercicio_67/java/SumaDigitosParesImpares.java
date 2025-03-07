import java.util.Scanner;

public class SumaDigitosParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();

        int sumaPares = 0, sumaImpares = 0;

        while (N > 0) {
            int digito = N % 10;
            if (digito % 2 == 0) {
                sumaPares += digito;
            } else {
                sumaImpares += digito;
            }
            N /= 10;
        }

        System.out.println("Suma de pares: " + sumaPares);
        System.out.println("Suma de impares: " + sumaImpares);

        scanner.close();
    }
}
