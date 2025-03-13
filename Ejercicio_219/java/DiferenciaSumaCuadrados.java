import java.util.Scanner;

public class DiferenciaSumaCuadrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de N: ");
        int N = scanner.nextInt();
        int sumaCuadrados = 0, cuadradoSuma = 0;

        for (int i = 1; i <= N; i++) {
            sumaCuadrados += i * i;
            cuadradoSuma += i;
        }

        cuadradoSuma = cuadradoSuma * cuadradoSuma;
        int diferencia = cuadradoSuma - sumaCuadrados;

        System.out.println("La diferencia es: " + diferencia);
        scanner.close();
    }
}
