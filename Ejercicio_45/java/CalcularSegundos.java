import java.util.Scanner;

public class CalcularSegundos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de horas: ");
        int horas = scanner.nextInt();
        
        System.out.print("Ingrese el número de minutos: ");
        int minutos = scanner.nextInt();
        
        System.out.print("Ingrese el número de segundos: ");
        int segundos = scanner.nextInt();
        
        int totalSegundos = (horas * 3600) + (minutos * 60) + segundos;
        
        System.out.println("El total de segundos es: " + totalSegundos);
    }
}
