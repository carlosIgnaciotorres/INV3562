import java.util.Scanner;

public class MultiplicarMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de filas de la primera matriz (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la primera matriz / filas de la segunda matriz (M): ");
        int M = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la segunda matriz (P): ");
        int P = scanner.nextInt();

        int[][] A = new int[N][M], B = new int[M][P], C = new int[N][P];

        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < M; i++)
            for (int j = 0; j < P; j++)
                B[i][j] = scanner.nextInt();

        for (int i = 0; i < N; i++)
            for (int j = 0; j < P; j++)
                for (int k = 0; k < M; k++)
                    C[i][j] += A[i][k] * B[k][j];

        System.out.println("La matriz resultante es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

        scanner.close();
    }
}
