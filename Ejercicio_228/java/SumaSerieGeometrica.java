import java.util.Scanner;

public class SumaSerieGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer término (a): ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese la razón (r): ");
        double r = scanner.nextDouble();
        System.out.print("Ingrese el número de términos (n): ");
        int n = scanner.nextInt();

        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma += a * Math.pow(r, i);
        }

        System.out.println("La suma de la serie geométrica es: " + suma);
        scanner.close();
    }
}
