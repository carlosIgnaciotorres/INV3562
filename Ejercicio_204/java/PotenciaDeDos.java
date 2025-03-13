import java.util.Scanner;

public class PotenciaDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        sc.close();

        if (N > 0 && (N & (N - 1)) == 0) {
            System.out.println("El número es una potencia de dos.");
        } else {
            System.out.println("El número no es una potencia de dos.");
        }
    }
}
