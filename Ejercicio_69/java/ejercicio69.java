import java.util.Scanner;

public class ContarDigitosYSumar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int cantidadDigitos = 0;

        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            cantidadDigitos++;
            numero /= 10;
        }

        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        System.out.println("Suma de los dígitos: " + suma);

        scanner.close();
    }
}
