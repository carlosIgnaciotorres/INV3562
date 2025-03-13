import java.util.Scanner;

public class VolumenEsfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double pi = 3.1416;
        System.out.print("Ingrese el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * pi * Math.pow(radio, 3);
        System.out.printf("El volumen de la esfera es: %.2f%n", volumen);
        scanner.close();
    }
}