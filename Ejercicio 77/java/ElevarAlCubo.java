import java.util.Scanner;

public class ElevarAlCubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();
        int cubo = n * n * n;
        System.out.println("El cubo de " + n + " es " + cubo);
    }
}
