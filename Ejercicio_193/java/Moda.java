import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Moda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números (N): ");
        int N = scanner.nextInt();

        int[] lista = new int[N];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
        }

        // Contar ocurrencias con un HashMap
        Map<Integer, Integer> frecuencia = new HashMap<>();
        for (int num : lista) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
        }

        // Encontrar la moda
        int moda = lista[0], maxFrecuencia = 0;
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            if (entry.getValue() > maxFrecuencia) {
                maxFrecuencia = entry.getValue();
                moda = entry.getKey();
            }
        }

        System.out.println("La moda es: " + moda);
        scanner.close();
    }
}
