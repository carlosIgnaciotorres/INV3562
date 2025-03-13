import java.util.Scanner;

public class DiferenciaMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();

        int[] lista = new int[N];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
        }

        int mayor = lista[0], menor = lista[0];

        for (int i = 1; i < N; i++) {
            if (lista[i] > mayor) mayor = lista[i];
            if (lista[i] < menor) menor = lista[i];
        }

        int diferencia = mayor - menor;

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La diferencia entre el mayor y el menor es: " + diferencia);

        scanner.close();
    }
}
