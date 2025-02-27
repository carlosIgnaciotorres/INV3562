import java.util.Scanner;

public class PorcentajeVaronesMujeres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de varones: ");
        int varones = scanner.nextInt();
        System.out.print("Ingresa la cantidad de mujeres: ");
        int mujeres = scanner.nextInt();
        int total = varones + mujeres;
        double porcentajeVarones = (varones / (double) total) * 100;
        double porcentajeMujeres = (mujeres / (double) total) * 100;
        System.out.printf("Porcentaje de varones: %.2f%%\n", porcentajeVarones);
        System.out.printf("Porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);
    }
}
