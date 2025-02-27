import java.util.Scanner;

public class CalcularMesesEntreAnios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer año: ");
        int anio1 = scanner.nextInt();
        System.out.print("Ingresa el segundo año: ");
        int anio2 = scanner.nextInt();
        int meses;
        if (anio1 > anio2) {
            meses = (anio1 - anio2) * 12;
        } else {
            meses = (anio2 - anio1) * 12;
        }
        System.out.println("Los meses transcurridos entre los inicios de los dos años son: " + meses);
    }
}
