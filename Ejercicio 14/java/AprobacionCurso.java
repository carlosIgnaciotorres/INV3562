import java.util.Scanner;

public class AprobacionCurso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingresa la primera calificación: ");
        double calificacion1 = scanner.nextDouble();
        
        System.out.print("Ingresa la segunda calificación: ");
        double calificacion2 = scanner.nextDouble();
        
        System.out.print("Ingresa la tercera calificación: ");
        double calificacion3 = scanner.nextDouble();

      
        double promedio = (calificacion1 + calificacion2 + calificacion3) / 3;

      
        if (promedio >= 10.5) {
            System.out.printf("El alumno aprueba con un promedio de %.2f%n", promedio);
        } else {
            System.out.printf("El alumno reprueba con un promedio de %.2f%n", promedio);
        }

        scanner.close();
    }
}
