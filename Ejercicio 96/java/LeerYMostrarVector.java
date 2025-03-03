import java.util.Scanner;

public class LeerYMostrarVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el valor en la posición " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
        System.out.println("Los valores ingresados son:");
        for (int valor : vector) {
            System.out.println(valor);
        }
        scanner.close();
    }
}
