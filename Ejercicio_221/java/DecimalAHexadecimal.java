import java.util.Scanner;

public class DecimalAHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int N = scanner.nextInt();
        String hexadecimal = "";

        while (N > 0) {
            int residuo = N % 16;
            if (residuo < 10) {
                hexadecimal = residuo + hexadecimal;
            } else {
                hexadecimal = (char) ('A' + residuo - 10) + hexadecimal;
            }
            N /= 16;
        }

        System.out.println("El número en hexadecimal es: " + hexadecimal);
        scanner.close();
    }
}
