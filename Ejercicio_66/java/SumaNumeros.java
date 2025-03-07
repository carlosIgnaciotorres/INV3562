import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a sumar (N): ");
        int N = scanner.nextInt();

        int suma = 0;
        int contador = 1;
        boolean excedido = false;

        while (contador <= N && !excedido) {
            System.out.print("Ingrese el número " + contador + ": ");
            int numero = scanner.nextInt();
            suma += numero;

            if (suma > 1000) {
                System.out.println("El número que excedió el límite fue: " + numero);
                excedido = true;
            }

            contador++;
        }

        if (!excedido) {
            System.out.println("La suma total es: " + suma);
        }

        scanner.close();
    }
}

