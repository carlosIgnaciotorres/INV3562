import java.util.Scanner;

public class ContarDivisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, contador_divisores = 0;

        System.out.print("Ingrese un número: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador_divisores++;
            }
        }

        System.out.println("Cantidad de divisores: " + contador_divisores);
        sc.close();
    }
}
