import java.util.Scanner;

public class ContarCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primera palabra:");
        String palabra1 = scanner.nextLine();
        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = scanner.nextLine();
        scanner.close();

        int contador = 0;
        for (int i = 0; i < palabra1.length(); i++) {
            char caracter = palabra1.charAt(i);
            if (palabra2.indexOf(caracter) != -1) {
                contador++;
                System.out.println("Caracter encontrado: " + caracter + " | Total: " + contador);
            }
        }
        System.out.println("Número total de caracteres de la primera palabra que aparecen en la segunda: " + contador);
    }
}
