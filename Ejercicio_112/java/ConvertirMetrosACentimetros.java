import java.util.Scanner;

public class ConvertirMetrosACentimetros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad en metros: ");
        double metros = scanner.nextDouble();

        double centimetros = metros * 100;

        System.out.println("La cantidad en centímetros es: " + centimetros);

        scanner.close();
    }
}
