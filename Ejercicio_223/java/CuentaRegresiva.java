import java.util.Scanner;

public class CuentaRegresiva {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tiempo en segundos: ");
        int N = scanner.nextInt();

        while (N >= 0) {
            System.out.println("Tiempo restante: " + N + " segundos");
            Thread.sleep(1000);
            N--;
        }

        System.out.println("¡Tiempo terminado!");
        scanner.close();
    }
}
