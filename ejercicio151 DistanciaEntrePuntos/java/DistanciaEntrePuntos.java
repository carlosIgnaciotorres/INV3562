import java.util.Scanner;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa x1: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Ingresa y1: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Ingresa x2: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Ingresa y2: ");
        double y2 = scanner.nextDouble();
        
        double diferencia_x = x2 - x1;
        double diferencia_y = y2 - y1;
        
        double distancia = Math.sqrt(Math.pow(diferencia_x, 2) + Math.pow(diferencia_y, 2));
        
        System.out.println("La distancia entre los puntos es: " + distancia);
    }
}