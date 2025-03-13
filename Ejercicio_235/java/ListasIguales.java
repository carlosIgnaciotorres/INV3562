import java.util.Arrays;
import java.util.Scanner;

public class ListasIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos en las listas: ");
        int N = scanner.nextInt();
        int[] lista1 = new int[N];
        int[] lista2 = new int[N];

        System.out.println("Ingrese los elementos de la primera lista:");
        for (int i = 0; i < N; i++) {
            lista1[i] = scanner.nextInt();
        }

        System.out.println("Ingrese los elementos de la segunda lista:");
        for (int i = 0; i < N; i++) {
            lista2[i] = scanner.nextInt();
        }

        Arrays.sort(lista1);
        Arrays.sort(lista2);

        if (Arrays.equals(lista1, lista2)) {
            System.out.println("Las listas son iguales sin importar el orden.");
        } else {
            System.out.println("Las listas no son iguales.");
        }

        scanner.close();
    }
}
