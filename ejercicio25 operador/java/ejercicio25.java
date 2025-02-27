import java.util.Scanner;

public class OperacionMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;
        boolean operadorValido = true;

        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("Error: División por cero no permitida.");
                    operadorValido = false;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                operadorValido = false;
                break;
        }

        if (operadorValido) {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }
}
