import java.util.Random;
import java.util.Scanner;

public class ProbabilidadCara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese la cantidad de lanzamientos: ");
        int N = scanner.nextInt();
        int caras = 0;

        for (int i = 0; i < N; i++) {
            if (random.nextInt(2) == 1) {
                caras++;
            }
        }

        double probabilidad = (double) caras / N;
        System.out.println("La probabilidad de obtener cara es: " + probabilidad);
        scanner.close();
    }
}
