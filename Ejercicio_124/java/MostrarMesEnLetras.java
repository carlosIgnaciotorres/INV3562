import java.util.Scanner;

public class MostrarMesEnLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes (número del 1 al 12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = scanner.nextInt();

        String[] meses = {"", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        String mesLetras = (mes >= 1 && mes <= 12) ? meses[mes] : "Mes inválido";

        System.out.println("La fecha ingresada es: " + dia + " de " + mesLetras + " de " + anio);

        scanner.close();
    }
}
