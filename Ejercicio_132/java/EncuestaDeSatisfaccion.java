import java.util.Scanner;

public class EncuestaDeSatisfaccion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma_calificaciones = 0;
        int contador_respuestas = 0;
        
        while (true) {
            System.out.print("Ingresa tu calificación (1-5): ");
            int calificacion = sc.nextInt();
            if (calificacion >= 1 && calificacion <= 5) {
                suma_calificaciones += calificacion;
                contador_respuestas++;
            } else {
                System.out.println("Calificación inválida, debe ser entre 1 y 5.");
            }

            System.out.print("¿Deseas ingresar otra calificación? (s/n): ");
            String respuesta = sc.next().toLowerCase();
            if (!respuesta.equals("s")) {
                break;
            }
        }

        if (contador_respuestas > 0) {
            double promedio = (double) suma_calificaciones / contador_respuestas;
            System.out.println("El promedio de satisfacción es: " + promedio);
        } else {
            System.out.println("No se ingresaron calificaciones válidas.");
        }
        
        sc.close();
    }
}
