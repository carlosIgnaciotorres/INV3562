import java.util.Scanner;

public class ListaOrdenada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] lista = new int[N];
        boolean creciente = true, decreciente = true;

        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            if (lista[i] < lista[i + 1]) {
                decreciente = false;
            }
            if (lista[i] > lista[i + 1]) {
                creciente = false;
            }
        }

        if (creciente) {
            System.out.println("La lista está ordenada de forma creciente.");
        } else if (decreciente) {
            System.out.println("La lista está ordenada de forma decreciente.");
        } else {
            System.out.println("La lista no está ordenada.");
        }
        scanner.close();
    }
}
