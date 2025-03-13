import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        sc.close();

        while (N != 1) {
            System.out.print(N + " ");
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = 3 * N + 1;
            }
        }
        System.out.println(N);
    }
}
