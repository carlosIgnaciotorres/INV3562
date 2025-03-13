import java.util.HashSet;
import java.util.Scanner;

public class NumeroFeliz {
    public static boolean esFeliz(int n) {
        HashSet<Integer> visto = new HashSet<>();
        while (n != 1 && !visto.contains(n)) {
            visto.add(n);
            int suma = 0;
            while (n > 0) {
                int digito = n % 10;
                suma += digito * digito;
                n /= 10;
            }
            n = suma;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scanner.nextInt();
        if (esFeliz(num)) {
            System.out.println("El número es feliz.");
        } else {
            System.out.println("El número no es feliz.");
        }
        scanner.close();
    }
}
