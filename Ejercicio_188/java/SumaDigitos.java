import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int suma = 0;
            while (num > 0) {
                suma += num % 10;
                num /= 10;
            }
            num = suma;
        }

        System.out.println("El resultado final es: " + num);
        sc.close();
    }
}
