import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                suma += i;
            }
        }

        if (suma == n) {
            System.out.println("El número " + n + " es perfecto.");
        } else {
            System.out.println("El número " + n + " no es perfecto.");
        }
        
        scanner.close();
    }
}
