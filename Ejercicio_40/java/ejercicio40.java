import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los valores de los dos catetos al usuario
        System.out.print("Ingrese el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();

        System.out.print("Ingrese el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        // Calcular el cuadrado de los catetos
        double cuadrado1 = Math.pow(cateto1, 2);
        double cuadrado2 = Math.pow(cateto2, 2);

        // Sumar los cuadrados de los catetos
        double sumaCuadrados = cuadrado1 + cuadrado2;

        // Calcular la hipotenusa aplicando la raíz cuadrada
        double hipotenusa = Math.sqrt(sumaCuadrados);

        // Imprimir el valor de la hipotenusa
        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);

        scanner.close();
    }
}
