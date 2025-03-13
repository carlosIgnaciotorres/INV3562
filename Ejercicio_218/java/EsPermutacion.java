import java.util.Arrays;
import java.util.Scanner;

public class EsPermutacion {
    public static boolean esPermutacion(int num1, int num2) {
        char[] arr1 = String.valueOf(num1).toCharArray();
        char[] arr2 = String.valueOf(num2).toCharArray();
        if (arr1.length != arr2.length) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (esPermutacion(num1, num2)) {
            System.out.println("Es una permutación.");
        } else {
            System.out.println("No es una permutación.");
        }

        scanner.close();
    }
}
