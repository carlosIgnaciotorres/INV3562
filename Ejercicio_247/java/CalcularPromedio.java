import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números:");
        int N = scanner.nextInt();

        double suma = 0;

        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un número:");
            double numero = scanner.nextDouble();
            suma += numero;
        }
        scanner.close();

        double promedio = suma / N;
        System.out.println("El promedio de los números ingresados es: " + promedio);
    }
}
