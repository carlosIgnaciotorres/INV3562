import java.util.Scanner;

public class GenerarImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número N: ");
        int N = scanner.nextInt();
        int contador = 1;
        while (contador <= N) {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador++;
        }
        scanner.close();
    }
}
