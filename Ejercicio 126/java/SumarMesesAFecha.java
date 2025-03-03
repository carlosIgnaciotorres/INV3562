import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
import java.util.Scanner;

public class SumarMesesAFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario que introduzca una fecha en formato yyyy-MM-dd
        System.out.print("Introduce una fecha (yyyy-MM-dd): ");
        String fechaIngresada = sc.nextLine();
        LocalDate fecha = LocalDate.parse(fechaIngresada, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        // Solicitar al usuario que introduzca la cantidad de meses a sumar
        System.out.print("Introduce el número de meses a sumar: ");
        int meses = sc.nextInt();

        // Sumar los meses a la fecha
        LocalDate nuevaFecha = fecha.plusMonths(meses);

        // Mostrar la nueva fecha
        System.out.println("La nueva fecha es: " + nuevaFecha.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }
}
