import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("La media aritmética es: " + media);
    }
}
