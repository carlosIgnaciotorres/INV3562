import java.util.Scanner;

public class ConversionHoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de horas (HH): ");
        int horas = scanner.nextInt();

        int minutos = horas * 60;
        int segundos = horas * 3600;

        System.out.println("Equivalente en minutos: " + minutos);
        System.out.println("Equivalente en segundos: " + segundos);

        scanner.close();
    }
}
