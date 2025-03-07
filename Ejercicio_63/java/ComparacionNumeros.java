import java.util.Scanner;  // Importamos la clase Scanner para leer entradas del usuario

public class ComparacionNumeros {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario que introduzca dos números
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();  // Lee el primer número

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();  // Lee el segundo número

        // Comparamos los dos números y mostramos el resultado
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que " + num2 + ".");
        } else if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que " + num2 + ".");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        // Cerramos el scanner
        scanner.close();
    }
}
