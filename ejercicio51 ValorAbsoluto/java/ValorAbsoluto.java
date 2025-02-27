import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        double num = scanner.nextDouble();

        if (num < 0) {
            num = num * -1;
        }

        System.out.println("El valor absoluto es: " + num);
        scanner.close();
    }
}
