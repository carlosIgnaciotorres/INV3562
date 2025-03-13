import java.util.Scanner;

public class RaizPerfecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        sc.close();

        int raiz = (int) Math.sqrt(N);

        if (raiz * raiz == N) {
            System.out.println("El número es una raíz perfecta.");
        } else {
            System.out.println("El número no es una raíz perfecta.");
        }
    }
}
