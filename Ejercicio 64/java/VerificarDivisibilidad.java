import java.util.Scanner;

public class VerificarDivisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (dividendo): ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número (divisor): ");
        int numero2 = scanner.nextInt();

        if (numero2 == 0) {
            System.out.println("Error: No se puede dividir entre 0.");
        } else {
            int residuo = numero1 % numero2;
            if (residuo == 0) {
                System.out.println("El número " + numero1 + " es divisible por " + numero2 + ".");
            } else {
                System.out.println("El número " + numero1 + " no es divisible por " + numero2 + ".");
            }
        }

        scanner.close();
    }
}
