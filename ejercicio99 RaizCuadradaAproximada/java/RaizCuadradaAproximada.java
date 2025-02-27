import java.util.Scanner;

public class RaizCuadradaAproximada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero >= 0) {
            double aproximacion = numero / 2;
            double precision = 0.0001;

            while (Math.abs((aproximacion * aproximacion) - numero) > precision) {
                aproximacion = (aproximacion + (numero / aproximacion)) / 2;
            }

            System.out.println("La raíz cuadrada aproximada es: " + aproximacion);
        } else {
            System.out.println("El número ingresado no es válido.");
        }

        scanner.close();
    }
}
