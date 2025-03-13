import java.util.Scanner;

public class CircumferenceCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();
        
        
        final double PI = 3.14;
        
        
        double longitud = 2 * PI * radio;
        
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        
        
        scanner.close();
    }
}
