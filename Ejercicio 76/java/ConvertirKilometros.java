import java.util.Scanner;

public class ConvertirKilometros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de kilómetros: ");
        double km = scanner.nextDouble();
        double metros = km * 1000;
        double centimetros = km * 100000;
        System.out.println(km + " kilómetros son " + metros + " metros y " + centimetros + " centímetros.");
    }
}
