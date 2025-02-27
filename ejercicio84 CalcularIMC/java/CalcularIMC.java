import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu peso en kilogramos (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingresa tu altura en metros (m): ");
        double altura = scanner.nextDouble();
        double imc = peso / (altura * altura);
        String estado;
        if (imc < 18.5) {
            estado = "Bajo peso";
        } else if (imc <= 24.9) {
            estado = "Peso normal";
        } else if (imc <= 29.9) {
            estado = "Sobrepeso";
        } else {
            estado = "Obesidad";
        }
        System.out.printf("Tu IMC es: %.2f%n", imc);
        System.out.println("Tu estado es: " + estado);
    }
}
