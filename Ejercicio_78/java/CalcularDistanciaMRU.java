import java.util.Scanner;

public class CalcularDistanciaMRU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la velocidad (en m/s): ");
        double velocidad = scanner.nextDouble();
        System.out.print("Ingresa el tiempo (en segundos): ");
        double tiempo = scanner.nextDouble();
        double distancia = velocidad * tiempo;
        System.out.println("La distancia recorrida es: " + distancia + " metros");
    }
}
