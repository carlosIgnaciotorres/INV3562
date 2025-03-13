import java.util.Scanner;

public class OrdenarBurbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] lista = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            lista[i] = scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                }
            }
        }

        System.out.println("Lista ordenada:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
