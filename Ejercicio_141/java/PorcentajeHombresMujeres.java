import java.util.Scanner;

public class PorcentajeHombresMujeres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de hombres: ");
        int hombres = sc.nextInt();
        System.out.print("Ingrese la cantidad de mujeres: ");
        int mujeres = sc.nextInt();
        int totalEstudiantes = hombres + mujeres;

        if (totalEstudiantes > 0) {
            double porcentajeHombres = (hombres / (double) totalEstudiantes) * 100;
            double porcentajeMujeres = (mujeres / (double) totalEstudiantes) * 100;
            System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
            System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");
        } else {
            System.out.println("Error: No hay estudiantes en el grupo");
        }
        sc.close();
    }
}
