import java.util.Scanner;

public class ProductoImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números impares: ");
        int N = sc.nextInt();
        int producto = 1;

        for (int i = 0; i < N; i++) {
            int impar = 2 * i + 1;
            producto *= impar;
        }

        System.out.println("El producto de los primeros " + N + " números impares es: " + producto);
        sc.close();
    }
}
