import java.util.Scanner;

public class CompararIniciales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Ingrese el segundo nombre: ");
        String nombre2 = scanner.nextLine();

        if (nombre1.length() > 0 && nombre2.length() > 0) {
            char inicial1 = nombre1.charAt(0);
            char inicial2 = nombre2.charAt(0);

            if (inicial1 == inicial2) {
                System.out.println("Los nombres tienen la misma inicial");
            } else {
                System.out.println("Los nombres no tienen la misma inicial");
            }
        } else {
            System.out.println("Error: Uno o ambos nombres están vacíos");
        }

        scanner.close();
    }
}
