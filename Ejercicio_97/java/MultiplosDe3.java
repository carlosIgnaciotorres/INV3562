import java.util.Scanner;

public class MultiplosDe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo (N): ");
        int N = scanner.nextInt();
        int i = 3;
        while (i <= N) {
            System.out.println(i);
            i += 3;
        }
        scanner.close();
    }
}
