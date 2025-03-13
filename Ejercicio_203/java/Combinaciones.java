import java.util.Scanner;

public class Combinaciones {
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número total de elementos (N): ");
        int N = sc.nextInt();
        System.out.print("Ingrese el número de elementos a tomar (K): ");
        int K = sc.nextInt();
        sc.close();

        long num = 1, den = 1;
        for (int i = 0; i < K; i++) {
            num *= (N - i);
            den *= (i + 1);
        }

        System.out.println("Las combinaciones posibles son: " + (num / den));
    }
}
