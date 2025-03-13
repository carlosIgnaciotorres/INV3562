import java.util.Scanner;

public class ContarPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, num, contadorPrimos = 0;

        System.out.print("Ingrese la cantidad de números: ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();

            if (num > 1) {
                boolean esPrimo = true;
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    contadorPrimos++;
                }
            }
        }

        System.out.println("Cantidad de números primos en la lista: " + contadorPrimos);
        sc.close();
    }
}
