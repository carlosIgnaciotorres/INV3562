import java.util.Scanner;

public class VerificarEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int edad = sc.nextInt();
        
        while (edad < 0 || edad > 120) {
            System.out.println("Edad inválida. Por favor, ingresa una edad entre 0 y 120.");
            edad = sc.nextInt();
        }
        
        System.out.println("Edad válida.");
    }
}
