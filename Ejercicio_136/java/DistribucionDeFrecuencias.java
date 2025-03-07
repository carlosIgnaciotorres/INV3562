import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class DistribucionDeFrecuencias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> lista_valores = new ArrayList<>();

        System.out.print("Ingrese el número de valores: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            double valor = scanner.nextDouble();
            lista_valores.add(valor);
        }

        int[] rangos = {0, 10, 20, 30, 40, 50};
        int[] frecuencias = new int[rangos.length - 1];

        for (double valor : lista_valores) {
            for (int i = 0; i < rangos.length - 1; i++) {
                if (valor >= rangos[i] && valor < rangos[i + 1]) {
                    frecuencias[i]++;
                }
            }
        }

        for (int i = 0; i < frecuencias.length; i++) {
            System.out.println("Rango " + rangos[i] + " - " + rangos[i+1] + ": " + frecuencias[i]);
        }

        scanner.close();
    }
}
