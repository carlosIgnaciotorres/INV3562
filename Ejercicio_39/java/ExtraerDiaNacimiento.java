import java.util.Scanner;

public class ExtraerDiaNacimiento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la fecha de nacimiento al usuario
        System.out.print("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = scanner.nextLine();

        // Extraer el día de la fecha de nacimiento
        String dia = fechaNacimiento.substring(0, 2);

        // Imprimir el día
        System.out.println("El número del día de su nacimiento es: " + dia);

        scanner.close();
    }
}
