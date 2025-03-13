import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su saldo disponible: ");
        double saldoDisponible = scanner.nextDouble();

        System.out.print("Ingrese la cantidad que desea retirar: ");
        double cantidadRetirar = scanner.nextDouble();

        if (cantidadRetirar <= saldoDisponible) {
            saldoDisponible -= cantidadRetirar;
            System.out.println("Retiro exitoso. Su saldo actual es: " + saldoDisponible);
        } else {
            System.out.println("Saldo insuficiente. Operación no realizada.");
        }

        scanner.close();
    }
}
