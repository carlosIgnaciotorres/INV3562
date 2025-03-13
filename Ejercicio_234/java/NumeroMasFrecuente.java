import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumeroMasFrecuente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        int[] lista = new int[N];

        System.out.println("Ingrese los números:");
        for (int i = 0; i < N; i++) {
            lista[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frecuencia = new HashMap<>();
        int numeroFrecuente = lista[0], maxFrecuencia = 0;

        for (int num : lista) {
            frecuencia.put(num, frecuencia.getOrDefault(num, 0) + 1);
            if (frecuencia.get(num) > maxFrecuencia) {
                maxFrecuencia = frecuencia.get(num);
                numeroFrecuente = num;
            }
        }

        System.out.println("El número más frecuente es: " + numeroFrecuente);
        scanner.close();
    }
}
