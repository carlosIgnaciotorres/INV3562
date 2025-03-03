import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entero positivo: ");
        int N = scanner.nextInt();

        if (N < 1) {
            System.out.println("El número debe ser mayor o igual a 1.");
        } else {
            int suma = (N * (N + 1)) / 2;
            System.out.println("La suma de los números enteros de 1 hasta " + N + " es: " + suma);
        }

        scanner.close();
    }
}
