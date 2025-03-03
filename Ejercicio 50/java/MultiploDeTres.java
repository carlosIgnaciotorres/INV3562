import java.util.Scanner;

public class MultiploDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();

        if (num % 3 == 0) {
            System.out.println("El número es múltiplo de 3");
        } else {
            System.out.println("El número no es múltiplo de 3");
        }

        scanner.close();
    }
}
