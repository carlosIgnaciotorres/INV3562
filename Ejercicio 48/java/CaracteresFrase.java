import java.util.Scanner;

public class CaracteresFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        
        int numCaracteres = frase.length();
        char primerCaracter = frase.charAt(0);
        char ultimoCaracter = frase.charAt(numCaracteres - 1);
        
        System.out.println("La frase tiene " + numCaracteres + " caracteres.");
        System.out.println("El primer carácter es: " + primerCaracter);
        System.out.println("El último carácter es: " + ultimoCaracter);
    }
}
