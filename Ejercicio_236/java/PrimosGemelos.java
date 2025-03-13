import java.util.Scanner;

public class PrimosGemelos {
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        int contador = 0;

        for (int i = 2; i <= N - 2; i++) {
            if (esPrimo(i) && esPrimo(i + 2)) {
                contador++;
            }
        }

        System.out.println("Cantidad de números primos gemelos en el rango: " + contador);
        scanner.close();
    }
}
