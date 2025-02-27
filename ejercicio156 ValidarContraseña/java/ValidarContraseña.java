import java.util.Scanner;

public class ValidarContraseña {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una contraseña: ");
        String contraseña = scanner.nextLine();
        
        int longitud = contraseña.length();
        
        if (longitud >= 8) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña inválida");
        }
    }
}