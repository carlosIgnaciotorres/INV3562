import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = sc.nextInt();
        System.out.print("Números primos entre 1 y " + N + ": ");

        for (int X = 2; X <= N; X++) {
            int contador = 0;
            for (int i = 1; i <= X; i++) {
                if (X % i == 0) {
                    contador++;
                }
            }
            if (contador == 2) {
                System.out.print(X + " ");
            }
        }
        sc.close();
    }
}
