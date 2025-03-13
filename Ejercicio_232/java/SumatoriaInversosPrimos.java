import java.util.Scanner;

public class SumatoriaInversosPrimos {
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el límite N: ");
        int N = scanner.nextInt();
        double suma = 0;

        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {
                suma += 1.0 / i;
            }
        }

        System.out.println("La sumatoria de los inversos de los primos hasta N es: " + suma);
        scanner.close();
    }
}
