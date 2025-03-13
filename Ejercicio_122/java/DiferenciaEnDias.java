import java.util.Scanner;

public class DiferenciaEnDias {
    public static int convertirADias(int dia, int mes, int anio) {
        return anio * 365 + (mes - 1) * 30 + dia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera fecha:");
        System.out.print("Día: ");
        int dia1 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes1 = scanner.nextInt();
        System.out.print("Año: ");
        int anio1 = scanner.nextInt();

        System.out.println("Ingrese la segunda fecha:");
        System.out.print("Día: ");
        int dia2 = scanner.nextInt();
        System.out.print("Mes: ");
        int mes2 = scanner.nextInt();
        System.out.print("Año: ");
        int anio2 = scanner.nextInt();

        int dias1 = convertirADias(dia1, mes1, anio1);
        int dias2 = convertirADias(dia2, mes2, anio2);

        int diferencia = Math.abs(dias2 - dias1);

        System.out.println("La diferencia en días entre las dos fechas es: " + diferencia);

        scanner.close();
    }
}
