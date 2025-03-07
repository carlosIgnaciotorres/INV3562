import java.util.Scanner;

public class CalcularDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();
        
        double diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        
        System.out.println("La diagonal del rectángulo es: " + diagonal);
        
        sc.close();
    }
}
