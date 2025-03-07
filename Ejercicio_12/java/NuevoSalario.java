import java.util.Scanner;

public class NuevoSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el salario original del obrero: ");
        double salarioOriginal = scanner.nextDouble();
        
        
        double incrementoPorcentaje = 25;
        
        
        double incremento = salarioOriginal * (incrementoPorcentaje / 100);
        
        
        double nuevoSalario = salarioOriginal + incremento;
        
        
        System.out.printf("El nuevo salario después del incremento del %.2f%% es: %.2f%n", incrementoPorcentaje, nuevoSalario);
        
        
        scanner.close();
    }
}
