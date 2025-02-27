import java.util.Scanner;

public class ControlIntentos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String datoCorrecto = "valorEsperado";
        int intentos = 0;
        
        while (intentos < 3) {
            System.out.print("Introduce el dato: ");
            String datoUsuario = sc.nextLine();
            
            if (datoUsuario.equals(datoCorrecto)) {
                System.out.println("Dato correcto ingresado.");
                break;
            } else {
                intentos++;
                if (intentos < 3) {
                    System.out.println("Intento " + intentos + " fallido. Intenta de nuevo.");
                } else {
                    System.out.println("Has agotado los 3 intentos. Acceso denegado.");
                }
            }
        }
    }
}
