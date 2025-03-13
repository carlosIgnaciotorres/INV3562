import java.util.Scanner;

public class SumarDiasAFecha {

    public static boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public static int diasEnMes(int mes, int anio) {
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

        // Entrada de datos
        System.out.print("Ingrese el día de la fecha inicial: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de la fecha inicial: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año de la fecha inicial: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese el número de días a sumar: ");
        int numeroDias = scanner.nextInt();

        // Sumar días
        dia += numeroDias;

        // Ajustar la fecha
        while (true) {
            int diasMes = diasEnMes(mes, anio);
            if (dia <= diasMes) {
                break;
            }
            dia -= diasMes;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }

        // Salida
        System.out.println("La nueva fecha es: " + dia + "/" + mes + "/" + anio);

        scanner.close();
    }
}
