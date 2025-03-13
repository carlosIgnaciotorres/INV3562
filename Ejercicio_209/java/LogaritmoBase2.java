import java.util.Scanner;

public class LogaritmoBase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        sc.close();

        int log = 0;
        while (N > 1) {
            N /= 2;
            log++;
        }

        System.out.println("El logaritmo en base 2 es: " + log);
    }
}
