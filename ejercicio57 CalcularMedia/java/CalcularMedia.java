import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int cantidad = 0;

        while (true) {
            System.out.print("Ingresar número (0 para terminar): ");
            double numero = sc.nextDouble();
            if (numero == 0) {
                break;
            }
            suma += numero;
            cantidad++;
        }

        if (cantidad > 0) {
            double media = suma / cantidad;
            System.out.println(media);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}
