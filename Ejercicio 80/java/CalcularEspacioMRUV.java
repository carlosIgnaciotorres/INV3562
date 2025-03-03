import java.util.Scanner;

public class CalcularEspacioMRUV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la velocidad inicial (Vi): ");
        double Vi = scanner.nextDouble();
        System.out.print("Ingresa la velocidad final (Vf): ");
        double Vf = scanner.nextDouble();
        System.out.print("Ingresa el tiempo (t): ");
        double t = scanner.nextDouble();
        double espacio = ((Vi + Vf) / 2) * t;
        System.out.println("El espacio recorrido es: " + espacio);
    }
}
