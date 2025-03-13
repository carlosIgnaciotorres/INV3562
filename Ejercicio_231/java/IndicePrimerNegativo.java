import java.util.Scanner;

public class IndicePrimerNegativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] lista = new int[N];
        int indice = -1;

        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
            if (lista[i] < 0 && indice == -1) {
                indice = i;
            }
        }

        if (indice == -1) {
            System.out.println("No hay números negativos en la lista.");
        } else {
            System.out.println("El primer número negativo está en el índice: " + indice);
        }
        scanner.close();
    }
}
