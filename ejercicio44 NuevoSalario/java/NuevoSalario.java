import java.util.Scanner;

public class NuevoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el salario actual: ");
        double salarioActual = scanner.nextDouble();
        
        double incremento = salarioActual * 0.25;
        double nuevoSalario = salarioActual + incremento;
        
        System.out.println("El nuevo salario es: " + nuevoSalario);
    }
}
