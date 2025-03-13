import java.util.Scanner;

public class ConvertirCentigradosAFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la temperatura en grados centígrados: ");
        double temperaturaCentigrados = scanner.nextDouble();

       
        double fahrenheit = (9.0 / 5.0) * temperaturaCentigrados + 32;

        
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}
