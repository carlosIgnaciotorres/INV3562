import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Double> cola = new LinkedList<>();
        Random rand = new Random();

        System.out.print("Ingrese el número de cajeros: ");
        int numCajeros = scanner.nextInt();
        System.out.print("Ingrese el tiempo promedio entre llegadas: ");
        double tasaLlegada = scanner.nextDouble();
        System.out.print("Ingrese el tiempo promedio de atención: ");
        double tasaServicio = scanner.nextDouble();
        System.out.print("Ingrese el tiempo total de simulación: ");
        double tiempoSimulacion = scanner.nextDouble();

        double tiempoActual = 0;
        double[] cajeros = new double[numCajeros];
        int clientesAtendidos = 0;

        while (tiempoActual < tiempoSimulacion) {
            double cliente = tiempoActual + rand.nextDouble() * tasaLlegada;
            cola.add(cliente);

            for (int i = 0; i < numCajeros; i++) {
                if (cajeros[i] == 0 && !cola.isEmpty()) {
                    double clienteAtendido = cola.poll();
                    cajeros[i] = tiempoActual + rand.nextDouble() * tasaServicio;
                }
            }

            for (int i = 0; i < numCajeros; i++) {
                if (cajeros[i] <= tiempoActual && cajeros[i] > 0) {
                    cajeros[i] = 0;
                    clientesAtendidos++;
                }
            }

            tiempoActual += 1;
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }

        System.out.println("Clientes atendidos: " + clientesAtendidos);
        scanner.close();
    }
}
