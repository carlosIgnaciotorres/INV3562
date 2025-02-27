import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

       
        int sumaDivisores = 0;

        
        for (int divisor = 1; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                sumaDivisores += divisor;
            }
        }

        
        if (sumaDivisores == numero) {
            System.out.println("El número " + numero + " es perfecto.");
        } else {
            System.out.println("El número " + numero + " no es perfecto.");
        }

        scanner.close();
    }
}
