import java.util.Scanner;

public class ContarParesImparesCeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0, ceros = 0, contador = 1;

        while (contador <= 10) {
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();

            if (numero == 0) {
                ceros++;
            } else if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            contador++;
        }

        System.out.println("Pares = " + pares);
        System.out.println("Impares = " + impares);
        System.out.println("Ceros = " + ceros);
    }
}
