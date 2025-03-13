import java.util.Scanner;

public class TrianguloDePascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura del triángulo de Pascal (N): ");
        int N = scanner.nextInt();
        int[][] pascal = new int[N][N];

        for (int i = 0; i < N; i++) {
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }

        System.out.println("Triángulo de Pascal:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
