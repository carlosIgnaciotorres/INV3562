import java.util.Scanner;

public class CalcularVolumenPrisma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el largo del prisma: ");
        double largo = sc.nextDouble();
        
        System.out.print("Ingrese el ancho del prisma: ");
        double ancho = sc.nextDouble();
        
        System.out.print("Ingrese la altura del prisma: ");
        double altura = sc.nextDouble();
        
        double volumen = largo * ancho * altura;
        
        System.out.println("El volumen del prisma es: " + volumen);
        
        sc.close();
    }
}
