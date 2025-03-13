import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        int contador = 0;
        double num;

        System.out.print("Ingrese un número positivo (negativo para terminar): ");
        num = sc.nextDouble();

        while (num >= 0) {
            suma += num;
            contador++;
            System.out.print("Ingrese otro número positivo (negativo para terminar): ");
            num = sc.nextDouble();
        }

        if (contador > 0) {
            System.out.println("La media de los números ingresados es: " + (suma / contador));
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        sc.close();
    }
}
