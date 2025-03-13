import java.util.Scanner;

public class InvertirNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();
        int invertido = 0;

        while (N > 0) {
            int digito = N % 10;
            invertido = invertido * 10 + digito;
            N /= 10;
        }

        System.out.println("Número invertido: " + invertido);
        scanner.close();
    }
}
