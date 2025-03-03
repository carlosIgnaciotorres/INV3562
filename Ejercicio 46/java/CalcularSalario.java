import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de la hora: ");
        double valorPorHora = scanner.nextDouble();
        
        double salarioTotal = horasTrabajadas * valorPorHora;
        double descuentoSS = salarioTotal * 0.10;
        double descuentoFondo = salarioTotal * 0.01;
        double salarioNeto = salarioTotal - descuentoSS - descuentoFondo;
        
        System.out.println("El salario neto a pagar es: " + salarioNeto);
    }
}
