import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
       
        double horasTrabajadas, valorHora, salarioBruto, descuentoSS, descuentoFondo, salarioNeto;
        
    
        System.out.print("Ingrese la cantidad de horas trabajadas en el mes: ");
        horasTrabajadas = scanner.nextDouble();
        
        System.out.print("Ingrese el valor de la hora de trabajo: ");
        valorHora = scanner.nextDouble();
        
        
        salarioBruto = horasTrabajadas * valorHora;
        
        
        descuentoSS = salarioBruto * 0.10;  
        descuentoFondo = salarioBruto * 0.01;  
        
        
        salarioNeto = salarioBruto - descuentoSS - descuentoFondo;
        
        
        System.out.println("Salario bruto: " + salarioBruto);
        System.out.println("Descuento por seguridad social (10%): " + descuentoSS);
        System.out.println("Descuento por fondo de empleados (1%): " + descuentoFondo);
        System.out.println("Salario neto a pagar: " + salarioNeto);
        
       
        scanner.close();
    }
}
