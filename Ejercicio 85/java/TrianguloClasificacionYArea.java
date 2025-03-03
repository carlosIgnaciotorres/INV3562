import java.util.Scanner;

public class TrianguloClasificacionYArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de A (lado menor): ");
        double A = scanner.nextDouble();
        System.out.print("Ingresa el valor de B (lado medio): ");
        double B = scanner.nextDouble();
        System.out.print("Ingresa el valor de C (lado mayor): ");
        double C = scanner.nextDouble();

        if (A + B > C) {
            String tipo;
            if (A == B && B == C) {
                tipo = "Equilátero";
            } else if (A == B || B == C || A == C) {
                tipo = "Isósceles";
            } else {
                tipo = "Escaleno";
            }
            double s = (A + B + C) / 2;
            double area = Math.sqrt(s * (s - A) * (s - B) * (s - C));
            System.out.println("El triángulo es: " + tipo);
            System.out.printf("El área del triángulo es: %.2f%n", area);
        } else {
            System.out.println("No es un triángulo válido.");
        }
    }
}
