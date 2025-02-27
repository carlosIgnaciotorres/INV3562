import java.util.Scanner;

public class ParImparMultiploDe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        boolean esPar = (numero % 2 == 0);
        boolean esMultiploDe5 = (numero % 5 == 0);
        
        if (esPar) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        
        if (esMultiploDe5) {
            System.out.println("El número es múltiplo de 5");
        } else {
            System.out.println("El número no es múltiplo de 5");
        }
    }
}