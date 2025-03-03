import java.util.Scanner;

public class Palindromo {
    public static boolean esPalindromo(String texto) {
        texto = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reverso = new StringBuilder(texto).reverse().toString();
        return texto.equals(reverso);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();
        
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo.");
        } else {
            System.out.println("No es un palíndromo.");
        }
        
        scanner.close();
    }
}
