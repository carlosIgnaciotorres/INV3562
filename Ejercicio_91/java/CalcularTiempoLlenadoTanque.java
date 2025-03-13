import java.util.Scanner;

public class CalcularTiempoLlenadoTanque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el flujo de la manguera en litros por minuto: ");
        double L = scanner.nextDouble();
        double capacidadEnLitros = 50 * 1000;
        double tiempoEnMinutos = capacidadEnLitros / L;
        double tiempoEnHoras = tiempoEnMinutos / 60;
        System.out.printf("El tiempo en minutos es: %.2f%n", tiempoEnMinutos);
        System.out.printf("El tiempo en horas es: %.2f%n", tiempoEnHoras);
    }
}
