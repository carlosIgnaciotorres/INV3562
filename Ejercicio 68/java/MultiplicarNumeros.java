import java.util.Scanner;

public class MultiplicarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a multiplicar: ");
        int N = scanner.nextInt();

        int multiplicador = 1;
        int contador = 1;

        while (contador <= N) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            multiplicador *= numero;
            contador++;
        }

        System.out.println("El resultado de la multiplicación es: " + multiplicador);
        scanner.close();
    }
}
