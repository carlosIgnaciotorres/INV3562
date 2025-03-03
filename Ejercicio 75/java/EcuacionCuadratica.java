import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a, b, c, D, raiz_D, x1, x2;
        
        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();
        
        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();
        
        D = b * b - 4 * a * c;
        
        if (D >= 0) {
            raiz_D = Math.sqrt(D);
            x1 = (-b + raiz_D) / (2 * a);
            x2 = (-b - raiz_D) / (2 * a);
            System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
        } else {
            System.out.println("No hay soluciones reales.");
        }
    }
}
