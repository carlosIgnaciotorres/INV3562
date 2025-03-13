import java.util.Scanner;

public class SumarDigitos {
    public static int sumarHastaUnaCifra(int n) {
        while (n >= 10) {
            int suma = 0;
            while (n > 0) {
                suma += n % 10;
                n /= 10;
            }
            n = suma;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int N = scanner.nextInt();
        System.out.println("Suma de los dígitos hasta una cifra: " + sumarHastaUnaCifra(N));
        scanner.close();
    }
}
