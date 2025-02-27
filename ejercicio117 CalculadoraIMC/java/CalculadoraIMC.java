import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        String estado;

        if (imc < 18.5) {
            estado = "Bajo peso";
        } else if (imc <= 24.9) {
            estado = "Normal";
        } else {
            estado = "Sobrepeso";
        }

        System.out.println("Su IMC es: " + imc);
        System.out.println("Estado: " + estado);

        scanner.close();
    }
}
