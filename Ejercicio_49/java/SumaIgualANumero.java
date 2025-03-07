import java.util.Scanner;

public class SumaIgualANumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        if (a + b == c) {
            System.out.println("La suma de a + b es igual a c");
        } else if (a + c == b) {
            System.out.println("La suma de a + c es igual a b");
        } else if (b + c == a) {
            System.out.println("La suma de b + c es igual a a");
        } else {
            System.out.println("Ninguna suma es igual a otro número");
        }

        scanner.close();
    }
}
