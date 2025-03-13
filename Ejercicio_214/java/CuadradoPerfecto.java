import java.util.Scanner;

public class CuadradoPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();
        int suma = 0, i = 1;

        while (suma < N) {
            suma += i;
            i += 2;
        }

        if (suma == N) {
            System.out.println("El número es un cuadrado perfecto.");
        } else {
            System.out.println("El número no es un cuadrado perfecto.");
        }

        scanner.close();
    }
}
