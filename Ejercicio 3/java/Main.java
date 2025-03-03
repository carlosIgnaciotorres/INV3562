import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor, ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        
        System.out.print("Por favor, ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double suma = numero1 + numero2;

        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma + ".");


        scanner.close();
    }
}
