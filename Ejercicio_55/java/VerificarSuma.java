import java.util.Scanner;

public class VerificarSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();
        
        double suma = numero1 + numero2;
        
        if (suma == numero3) {
            System.out.println("El tercer número es igual a la suma de los dos primeros");
        } else {
            System.out.println("El tercer número NO es igual a la suma de los dos primeros");
        }
    }
}
