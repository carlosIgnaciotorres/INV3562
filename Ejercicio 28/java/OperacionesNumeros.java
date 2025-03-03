import java.util.Scanner;

public class OperacionesNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma, el cociente y el residuo
        double suma = numero1 + numero2;
        double cociente = numero1 / numero2;
        double residuo = numero1 % numero2;

        // Imprimir los resultados
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El cociente de los números es: " + cociente);
        System.out.println("El residuo de los números es: " + residuo);

        scanner.close();
    }
}
