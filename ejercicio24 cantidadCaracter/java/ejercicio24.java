import java.util.Scanner;

public class CompararLongitudNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        int longitud1 = nombre1.length();
        int longitud2 = nombre2.length();

        if (longitud1 > longitud2) {
            System.out.println("El primer nombre tiene más caracteres.");
        } else if (longitud1 == longitud2) {
            System.out.println("Ambos nombres tienen la misma cantidad de caracteres.");
        } else {
            System.out.println("El segundo nombre tiene más caracteres.");
        }

        scanner.close();
    }
}
