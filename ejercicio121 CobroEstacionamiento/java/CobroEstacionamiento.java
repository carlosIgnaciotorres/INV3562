import java.util.Scanner;

public class CobroEstacionamiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas que estuvo estacionado: ");
        double horas = scanner.nextDouble();

        System.out.print("Ingrese la tarifa por hora: ");
        double tarifa = scanner.nextDouble();

        double total = horas * tarifa;

        System.out.println("El total a pagar es: " + total);

        scanner.close();
    }
}
