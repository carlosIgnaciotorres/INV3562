import java.util.Scanner;

public class ContarPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num, contador_pares = 0;

        System.out.print("Ingrese la cantidad de números: ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
            if (num % 2 == 0) {
                contador_pares++;
            }
        }

        System.out.println("Cantidad de números pares: " + contador_pares);
        sc.close();
    }
}
