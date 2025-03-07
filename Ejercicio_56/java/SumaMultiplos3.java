import java.util.Scanner;

public class SumaMultiplos3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Ingresar número: ");
            int numero = sc.nextInt();
            if (numero % 3 == 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los múltiplos de 3 es: " + suma);
    }
}
