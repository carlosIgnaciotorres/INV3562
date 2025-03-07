import java.util.Scanner;

public class RaizCubica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        double N = sc.nextDouble();
        
        double X = N / 3;
        double tolerancia = 0.0001;
        double X_nuevo;
        
        do {
            X_nuevo = (2 * X + N / (X * X)) / 3;
        } while (Math.abs(X_nuevo - X) >= tolerancia);
        
        System.out.println("La raíz cúbica aproximada es: " + X_nuevo);
        
        sc.close();
    }
}
