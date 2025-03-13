import java.util.Scanner;

public class ConvertirDolaresAEuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en dólares:");
        double dolares = scanner.nextDouble();
        System.out.println("Ingrese la tasa de cambio (1 dólar a cuántos euros equivale):");
        double tasa = scanner.nextDouble();
        scanner.close();
        
        double euros = dolares * tasa;
        System.out.println("El equivalente en euros es: " + euros);
    }
}
