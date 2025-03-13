import java.util.Random;
import java.util.Scanner;

public class LanzamientoDeDosDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese la cantidad de lanzamientos: ");
        int N = scanner.nextInt();
        int dobles = 0;

        for (int i = 0; i < N; i++) {
            int dado1 = random.nextInt(6) + 1;
            int dado2 = random.nextInt(6) + 1;
            if (dado1 == dado2) {
                dobles++;
            }
        }

        System.out.println("Cantidad de dobles obtenidos: " + dobles);
        scanner.close();
    }
}
