import java.util.Scanner;

public class ContarCaracteresEspeciales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
                contador++;
            }
        }

        System.out.println("Cantidad de caracteres especiales: " + contador);
        scanner.close();
    }
}
