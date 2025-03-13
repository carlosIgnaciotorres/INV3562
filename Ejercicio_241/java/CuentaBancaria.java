import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo, monto;
        int opcion;

        System.out.print("Ingrese el saldo inicial de la cuenta: ");
        saldo = scanner.nextDouble();

        while (true) {
            System.out.println("Seleccione una opción: 1) Depositar  2) Retirar  3) Salir");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese la cantidad a depositar: ");
                monto = scanner.nextDouble();
                saldo += monto;
                System.out.println("Nuevo saldo: " + saldo);
            } 
            else if (opcion == 2) {
                System.out.print("Ingrese la cantidad a retirar: ");
                monto = scanner.nextDouble();
                if (monto <= saldo) {
                    saldo -= monto;
                    System.out.println("Nuevo saldo: " + saldo);
                } else {
                    System.out.println("Error: Fondos insuficientes.");
                }
            } 
            else if (opcion == 3) {
                System.out.println("Operaciones finalizadas. Saldo final: " + saldo);
                break;
            }
        }

        scanner.close();
    }
}
