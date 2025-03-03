import java.util.Scanner;

public class Primeros30Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int contador = 1;
        while (contador <= 30) {
            int multiplo = numero * contador;
            System.out.println(multiplo);
            contador++;
        }

        scanner.close();
    }
}
