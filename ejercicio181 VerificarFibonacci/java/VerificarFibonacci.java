import java.util.Scanner;

public class VerificarFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        int a = 0, b = 1, c = a + b;

        if (num == 0 || num == 1) {
            System.out.println(num + " pertenece a la secuencia de Fibonacci.");
        } else {
            while (c < num) {
                a = b;
                b = c;
                c = a + b;
            }

            if (c == num) {
                System.out.println(num + " pertenece a la secuencia de Fibonacci.");
            } else {
                System.out.println(num + " no pertenece a la secuencia de Fibonacci.");
            }
        }

        sc.close();
    }
}
