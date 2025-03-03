import java.util.Scanner;

public class OrdenarTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3) {
            if (numero2 >= numero3) {
                System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            } else {
                System.out.println(numero1 + ", " + numero3 + ", " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            if (numero1 >= numero3) {
                System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            } else {
                System.out.println(numero2 + ", " + numero3 + ", " + numero1);
            }
        } else {
            if (numero1 >= numero2) {
                System.out.println(numero3 + ", " + numero1 + ", " + numero2);
            } else {
                System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            }
        }

        scanner.close();
    }
}
