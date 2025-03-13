import java.util.Scanner;

public class SerieArmonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        double suma = 0;

        for (int i = 1; i <= N; i++) {
            suma += 1.0 / i;
        }

        System.out.println("La suma de la serie armónica hasta N es: " + suma);
        scanner.close();
    }
}
