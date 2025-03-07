import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese su peso en kilogramos (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros (m): ");
        double altura = scanner.nextDouble();

        
        double imc = peso / (altura * altura);

        
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);

    
        if (imc < 18.5) {
            System.out.println("Usted está en el rango de BAJO PESO.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Usted está en el rango de PESO NORMAL (saludable).");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Usted está en el rango de SOBREPESO.");
        } else {
            System.out.println("Usted está en el rango de OBESIDAD.");
        }

        
        scanner.close();
    }
}