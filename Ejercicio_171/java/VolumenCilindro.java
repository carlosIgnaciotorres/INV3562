import java.util.Scanner;

public class VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double PI = Math.PI; // Usa el valor de PI exacto
        
        System.out.print("Ingrese el radio del cilindro: ");
        double radio = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del cilindro: ");
        double altura = scanner.nextDouble();
        
        double volumen = PI * Math.pow(radio, 2) * altura;
        
        System.out.printf("El volumen del cilindro es: %.2f%n", volumen);
        
        scanner.close();
    }
}
