import java.util.Scanner;

public class ContarMayoresQueMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = scanner.nextInt();
        double[] lista = new double[N];
        double suma = 0, media;
        int contador = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese un número: ");
            lista[i] = scanner.nextDouble();
            suma += lista[i];
        }

        media = suma / N;

        for (double num : lista) {
            if (num > media) {
                contador++;
            }
        }

        System.out.println("Cantidad de números mayores que la media: " + contador);
        scanner.close();
    }
}
