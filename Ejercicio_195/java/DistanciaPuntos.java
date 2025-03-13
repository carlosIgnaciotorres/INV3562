import java.util.Scanner;

public class DistanciaPuntos {
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese x1 y1: ");
        double x1 = scanner.nextDouble(), y1 = scanner.nextDouble();
        System.out.print("Ingrese x2 y2: ");
        double x2 = scanner.nextDouble(), y2 = scanner.nextDouble();
        System.out.println("La distancia entre los puntos es: " + calcularDistancia(x1, y1, x2, y2));
        scanner.close();
    }
}
