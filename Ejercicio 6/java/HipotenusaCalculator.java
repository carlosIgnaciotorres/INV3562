import java.util.Scanner;

public class HipotenusaCalculator {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Introduce el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Introduce el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
      
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        
       
        System.out.printf("La hipotenusa del triángulo rectángulo es: %.2f\n", hipotenusa);
        
    
        scanner.close();
    }
}
