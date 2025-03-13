import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ModaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de calificaciones: ");
        int N = scanner.nextInt();
        int[] calificaciones = new int[N];

        System.out.println("Ingrese las calificaciones:");
        for (int i = 0; i < N; i++) {
            calificaciones[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frecuencia = new HashMap<>();
        int moda = calificaciones[0], maxFrecuencia = 0;

        for (int calificacion : calificaciones) {
            frecuencia.put(calificacion, frecuencia.getOrDefault(calificacion, 0) + 1);
            if (frecuencia.get(calificacion) > maxFrecuencia) {
                maxFrecuencia = frecuencia.get(calificacion);
                moda = calificacion;
            }
        }

        System.out.println("La moda es: " + moda);
        System.out.println("Distribución de calificaciones:");
        for (Map.Entry<Integer, Integer> entry : frecuencia.entrySet()) {
            System.out.println("Calificación " + entry.getKey() + " aparece " + entry.getValue() + " veces.");
        }

        scanner.close();
    }
}
