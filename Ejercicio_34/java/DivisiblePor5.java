import java.util.Scanner;

public class DivisiblePor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        
        if (numero % 5 == 0) {
            System.out.println("El número es divisible por 5");
        } else {
            System.out.println("El número no es divisible por 5");
        }

        scanner.close();
    }
}
