import java.util.Scanner;

public class ImprimirPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        if (num1 > 0) {
            System.out.println("El primer número es positivo: " + num1);
        }

        if (num2 > 0) {
            System.out.println("El segundo número es positivo: " + num2);
        }

        scanner.close();
    }
}
