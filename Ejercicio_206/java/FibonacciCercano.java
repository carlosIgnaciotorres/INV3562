import java.util.Scanner;

public class FibonacciCercano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        sc.close();

        int a = 0, b = 1, fib1 = 0, fib2 = 1;
        
        while (b <= N) {
            fib1 = a;
            fib2 = b;
            a = b;
            b = a + fib1;
        }
        
        if ((N - fib1) <= (fib2 - N)) {
            System.out.println("El número de Fibonacci más cercano es: " + fib1);
        } else {
            System.out.println("El número de Fibonacci más cercano es: " + fib2);
        }
    }
}
