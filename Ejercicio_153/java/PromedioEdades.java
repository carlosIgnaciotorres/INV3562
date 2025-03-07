import java.util.Scanner;

public class PromedioEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();
        
        int[] edades = new int[cantidadPersonas];
        int sumaEdades = 0;
        
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.print("Ingresa la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
            sumaEdades += edades[i];
        }
        
        double promedio = (double) sumaEdades / cantidadPersonas;
        System.out.println("El promedio de edades es: " + promedio);
    }
}