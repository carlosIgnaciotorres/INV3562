import java.util.Scanner;

public class PersonaDatos {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
       
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
      
        scanner.nextLine(); 
        
     
        System.out.print("Ingrese su sexo (masculino/femenino): ");
        String sexo = scanner.nextLine();
        
        
        if (sexo.equalsIgnoreCase("masculino") && edad >= 18) {
            System.out.println("El nombre de la persona es: " + nombre);
        } else {
            System.out.println("La persona no cumple con los criterios.");
        }
        
        
        scanner.close();
    }
}
