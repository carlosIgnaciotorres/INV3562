import java.util.Scanner;

public class LeerEImprimir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        double doble = numero * 2;
        double cuadrado = numero * numero;

        System.out.println("Número leído: " + numero);
        System.out.println("El doble del número: " + doble);
        System.out.println("El cuadrado del número: " + cuadrado);

        scanner.close();
    }
}
