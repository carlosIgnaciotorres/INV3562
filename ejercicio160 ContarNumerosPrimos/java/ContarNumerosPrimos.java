import java.util.Scanner;

public class ContarNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int contador = 0;

        for (int numero : numeros) {
            if (numero < 2) {
                continue;
            }
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(numero); j++) {
                if (numero % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
            }
        }

        System.out.println("La cantidad de números primos es: " + contador);
        scanner.close();
    }
}