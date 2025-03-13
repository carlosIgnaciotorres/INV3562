import java.util.Scanner;

public class VolumenCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del cubo:");
        double lado = scanner.nextDouble();
        scanner.close();

        double volumen = Math.pow(lado, 3);
        System.out.println("El volumen del cubo es: " + volumen);
    }
}
