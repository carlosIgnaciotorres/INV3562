import java.util.Scanner;

public class MostrarNumerosEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número (numero1): ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número (numero2): ");
        int numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            System.out.println("Error: el primer número debe ser menor o igual al segundo.");
        } else {
            int contador = numero1;
            while (contador <= numero2) {
                System.out.println(contador);
                contador++;
            }
        }

        scanner.close();
    }
}
