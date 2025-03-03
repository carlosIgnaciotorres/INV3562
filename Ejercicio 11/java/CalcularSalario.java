import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese el valor por hora: ");
        double valorPorHora = scanner.nextDouble();
        
        
        double salario = horasTrabajadas * valorPorHora;
        
        
        System.out.printf("El salario total es: %.2f%n", salario);
        
        
        scanner.close();
    }
}
