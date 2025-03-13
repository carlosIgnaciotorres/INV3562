import java.util.Scanner;

public class CuadradoPerfecto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        double raiz = Math.sqrt(numero);
        int raizRedondeada = (int) Math.round(raiz);
        
        if (raizRedondeada * raizRedondeada == numero) {
            System.out.println("Es un cuadrado perfecto");
        } else {
            System.out.println("No es un cuadrado perfecto");
        }
    }
}