import java.util.Scanner;

public class MatrizSimetrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz cuadrada (N x N): ");
        int N = scanner.nextInt();
        int[][] A = new int[N][N];
        boolean simetrica = true;

        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                A[i][j] = scanner.nextInt();

        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (A[i][j] != A[j][i])
                    simetrica = false;

        System.out.println(simetrica ? "La matriz es simétrica." : "La matriz no es simétrica.");
        scanner.close();
    }
}
