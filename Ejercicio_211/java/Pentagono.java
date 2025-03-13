import java.util.Scanner;

public class Pentagono {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del pentágono: ");
        double L = sc.nextDouble();
        sc.close();

        double perimetro = 5 * L;
        double apotema = L / (2 * Math.tan(Math.toRadians(36)));
        double area = (perimetro * apotema) / 2;

        System.out.println("El perímetro es: " + perimetro);
        System.out.println("El área es: " + area);
    }
}
