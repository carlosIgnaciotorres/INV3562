import java.util.Scanner;

public class VerificarFechaValida {
    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int diasEnMes(int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return 0;
        }
        if (mes == 2) {
            return esBisiesto(anio) ? 29 : 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        int diasMes = diasEnMes(mes, anio);

        if (diasMes == 0) {
            System.out.println("Fecha inválida: el mes debe estar entre 1 y 12.");
        } else if (dia < 1 || dia > diasMes) {
            System.out.println("Fecha inválida: el día no existe en este mes.");
        } else {
            System.out.println("Fecha válida.");
        }

        scanner.close();
    }
}
