import java.util.Scanner;

public class LetraDNI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        System.out.print("Ingrese el número de DNI: ");
        int dni = scanner.nextInt();
        
        if (dni < 0) {
            System.out.println("El DNI no puede ser negativo.");
        } else {
            char letra = letras.charAt(dni % 23);
            System.out.println("La letra del DNI es: " + letra);
        }
        
        scanner.close();
    }
}
