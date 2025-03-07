import java.util.Scanner;

public class DivisionMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        double resultado;

        if (numero1 > numero2) {
            resultado = numero1 / numero2;
        } else if (numero2 > numero1) {
            resultado = numero2 / numero1;
        } else {
            resultado = 1; 
        }

        System.out.println("El resultado de la división del número mayor entre el número menor es: " + resultado);

        scanner.close();
    }
}
