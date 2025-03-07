import java.util.Scanner;

public class LongitudCircunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorPi = 3.14;
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        double longitudCircunferencia = 2 * valorPi * radio;
        System.out.println("La longitud de la circunferencia es: " + longitudCircunferencia);
    }
}
