import java.util.Scanner;

public class ConversionDivisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el monto en dólares: ");
        double montoDolares = scanner.nextDouble();

        System.out.print("Ingrese el tipo de cambio (cuántos pesos equivale un dólar): ");
        double tipoCambio = scanner.nextDouble();

        double montoPesos = montoDolares * tipoCambio;

        System.out.println("El monto equivalente en pesos es: " + montoPesos);

        scanner.close();
    }
}
