import java.util.Scanner;

public class PrimoMersenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número primo p: ");
        int p = sc.nextInt();
        sc.close();
        
        long n = (1L << p) - 1;
        boolean esPrimo = true;
        
        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                esPrimo = false;
                break;
            }
        }
        
        if (esPrimo) {
            System.out.println(n + " es un primo de Mersenne.");
        } else {
            System.out.println(n + " no es un primo de Mersenne.");
        }
    }
}
