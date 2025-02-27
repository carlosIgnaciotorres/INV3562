import java.util.Scanner;

public class CalcularTotalCaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de billetes de $1000: ");
        int billetes1000 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $500: ");
        int billetes500 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $200: ");
        int billetes200 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $100: ");
        int billetes100 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $50: ");
        int billetes50 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $20: ");
        int billetes20 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de billetes de $10: ");
        int billetes10 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de monedas de $5: ");
        int monedas5 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de monedas de $2: ");
        int monedas2 = scanner.nextInt();
        System.out.print("Ingrese la cantidad de monedas de $1: ");
        int monedas1 = scanner.nextInt();

        int total = (
            billetes1000 * 1000 +
            billetes500 * 500 +
            billetes200 * 200 +
            billetes100 * 100 +
            billetes50 * 50 +
            billetes20 * 20 +
            billetes10 * 10 +
            monedas5 * 5 +
            monedas2 * 2 +
            monedas1 * 1
        );

        System.out.println("El total de dinero en la caja es: $" + total);
        scanner.close();
    }
}