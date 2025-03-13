import java.util.Scanner;

public class ContarPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine().trim();
        
        if (frase.isEmpty()) {
            System.out.println("Cantidad de palabras en la frase: 0");
        } else {
            String[] palabras = frase.split("\\s+");
            System.out.println("Cantidad de palabras en la frase: " + palabras.length);
        }
        
        scanner.close();
    }
}
