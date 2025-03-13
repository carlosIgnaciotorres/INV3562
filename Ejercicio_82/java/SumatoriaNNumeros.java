import java.util.Scanner;

public class SumatoriaNNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de N: ");
        int N = scanner.nextInt();
        int sumatoria = 0;
        int contador = 1;
        while (contador <= N) {
            sumatoria += contador;
            contador++;
        }
        System.out.println("La sumatoria es: " + sumatoria);
    }
}
