import java.util.Scanner;

public class SumarMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int M = scanner.nextInt();
        int[][] A = new int[N][M], B = new int[N][M], C = new int[N][M];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                B[i][j] = scanner.nextInt();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("La matriz resultante es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        scanner.close();
    }
}
