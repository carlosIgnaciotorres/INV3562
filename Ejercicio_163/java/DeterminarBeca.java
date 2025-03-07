import java.util.Scanner;

public class DeterminarBeca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el promedio del estudiante (0-10): ");
        double promedio = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nivel socioeconómico (bajo, medio, alto): ");
        String nivelSocioeconomico = scanner.nextLine().toLowerCase();

        String beca;

        if (promedio >= 9.0) {
            beca = "beca completa";
        } else if (promedio >= 8.0 && promedio <= 8.9) {
            if (nivelSocioeconomico.equals("bajo") || nivelSocioeconomico.equals("medio")) {
                beca = "beca parcial";
            } else {
                beca = "ninguna beca";
            }
        } else {
            beca = "ninguna beca";
        }

        System.out.println("El estudiante recibe una " + beca + ".");
        scanner.close();
    }
}