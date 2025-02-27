import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        while (numero > 0) {
            int digito = numero % 10;
            System.out.println(digito);
            numero = numero / 10;
        }
    }
}
