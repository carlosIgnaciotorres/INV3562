import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class NumerosAleatoriosSinRepetir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Ingrese el valor mínimo del rango: ");
        int minimo = scanner.nextInt();
        System.out.print("Ingrese el valor máximo del rango: ");
        int maximo = scanner.nextInt();
        System.out.print("Ingrese cuántos números desea generar: ");
        int cantidad = scanner.nextInt();
        
        if (cantidad > (maximo - minimo + 1)) {
            System.out.println("No se pueden generar más números únicos que el tamaño del rango.");
            return;
        }
        
        HashSet<Integer> numerosGenerados = new HashSet<>();
        
        while (numerosGenerados.size() < cantidad) {
            int num = random.nextInt(maximo - minimo + 1) + minimo;
            numerosGenerados.add(num);
        }
        
        System.out.println("Números generados sin repetir: " + numerosGenerados);
        scanner.close();
    }
}
