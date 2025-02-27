import java.util.Scanner;

public class PerimetroPoligono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de lados del polígono: ");
        int n = scanner.nextInt();
        
        System.out.print("Ingrese la longitud de un lado: ");
        double l = scanner.nextDouble();
        
        double perimetro = n * l;
        System.out.println("El perímetro del polígono es: " + perimetro);
        
        scanner.close();
    }
}
