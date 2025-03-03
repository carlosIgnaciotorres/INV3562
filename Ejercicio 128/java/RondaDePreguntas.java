import java.util.Scanner;

public class RondaDePreguntas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aciertos = 0;
        int totalPreguntas = 3;
        int preguntaActual = 1;
        
        while (preguntaActual <= totalPreguntas) {
            System.out.print("Pregunta " + preguntaActual + ": ¿Sí o No? ");
            String respuesta = sc.nextLine();
            
            if (respuesta.equals("sí") || respuesta.equals("no")) {
                aciertos++;
            }
            
            preguntaActual++;
        }
        
        System.out.println("Total de aciertos: " + aciertos);
    }
}
