import java.util.Scanner;

public class CalcularInteresesReinversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el monto invertido: ");
        double montoInvertido = scanner.nextDouble();
        System.out.print("Ingresa la tasa de interés (%): ");
        double tasaInteres = scanner.nextDouble();
        double intereses = montoInvertido * (tasaInteres / 100);
        double montoFinal;
        if (intereses > 7000) {
            montoFinal = montoInvertido + intereses;
        } else {
            montoFinal = montoInvertido;
        }
        System.out.printf("Los intereses generados son: %.2f%n", intereses);
        System.out.printf("El monto final en la cuenta es: %.2f%n", montoFinal);
    }
}
