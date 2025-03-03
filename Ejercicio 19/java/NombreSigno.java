import java.util.Scanner;

public class NombreSigno {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
       
        System.out.print("Ingrese su signo zodiacal: ");
        String signo = scanner.nextLine();
        
     
        if (signo.equalsIgnoreCase("Aries")) {
            System.out.println("El nombre de la persona es: " + nombre);
        } else {
            System.out.println("La persona no es Aries.");
        }
        
        
        scanner.close();
    }
}
