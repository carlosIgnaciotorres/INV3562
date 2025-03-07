import java.util.Scanner;

public class DiferenciaMinutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera hora (HH MM): ");
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();

        System.out.print("Ingrese la segunda hora (HH MM): ");
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();

        int minutos1 = (h1 * 60) + m1;
        int minutos2 = (h2 * 60) + m2;
        
        int diferencia = Math.abs(minutos2 - minutos1);

        System.out.println("La diferencia en minutos es: " + diferencia);

        scanner.close();
    }
}
