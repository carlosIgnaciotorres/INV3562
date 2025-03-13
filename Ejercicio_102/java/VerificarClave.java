import java.util.Scanner;

public class VerificarClave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String claveEstablecida = "miClaveSecreta";
        System.out.print("Introduce la clave de acceso: ");
        String claveUsuario = sc.nextLine();
        
        if (claveUsuario.equals(claveEstablecida)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Clave incorrecta.");
        }
    }
}
