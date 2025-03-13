import java.util.Scanner;
import java.util.Random;

public class NumeroAleatorioParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el valor mínimo:");
        int minimo = scanner.nextInt();

        System.out.println("Ingrese el valor máximo:");
        int maximo = scanner.nextInt();
        scanner.close();

        int numero = random.nextInt((maximo - minimo) + 1) + minimo;

        System.out.println("Número generado: " + numero);

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }
}
