import java.util.*;

public class Estadisticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();

        System.out.print("Ingrese el número de elementos: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            double num = scanner.nextDouble();
            numeros.add(num);
        }

        System.out.println("Media: " + calcularMedia(numeros));
        System.out.println("Mediana: " + calcularMediana(numeros));
        System.out.println("Moda: " + calcularModa(numeros));
    }

    public static double calcularMedia(List<Double> numeros) {
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.size();
    }

    public static double calcularMediana(List<Double> numeros) {
        Collections.sort(numeros);
        int n = numeros.size();
        int mid = n / 2;
        if (n % 2 == 0) {
            return (numeros.get(mid - 1) + numeros.get(mid)) / 2;
        } else {
            return numeros.get(mid);
        }
    }

    public static double calcularModa(List<Double> numeros) {
        Map<Double, Integer> frecuencias = new HashMap<>();
        for (double num : numeros) {
            frecuencias.put(num, frecuencias.getOrDefault(num, 0) + 1);
        }
        int maxFreq = Collections.max(frecuencias.values());
        for (Map.Entry<Double, Integer> entry : frecuencias.entrySet()) {
            if (entry.getValue() == maxFreq) {
                return entry.getKey();
            }
        }
        return -1;  // in case there is no single moda
    }
}
