import java.util.Scanner;

public class CalcularHipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del primer cateto: ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Ingrese el valor del segundo cateto: ");
        double cateto2 = scanner.nextDouble();
        
        double sumaCuadrados = (cateto1 * cateto1) + (cateto2 * cateto2);
        double hipotenusa = Math.sqrt(sumaCuadrados);
        
        System.out.println("La hipotenusa es: " + hipotenusa);
    }
}
