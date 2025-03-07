import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("División: " + division);
        } else {
            System.out.println("Error: No se puede dividir por cero");
        }
        
        sc.close();
    }
}
