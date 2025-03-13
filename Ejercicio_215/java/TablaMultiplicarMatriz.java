import java.util.Scanner;

public class TablaMultiplicarMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la tabla de multiplicar: ");
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
