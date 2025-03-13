import java.util.Scanner;

public class LuhnAlgorithm {
    public static boolean luhnCheck(String number) {
        int total = 0;
        boolean alternate = false;
        
        for (int i = number.length() - 1; i >= 0; i--) {
            int n = Character.getNumericValue(number.charAt(i));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            total += n;
            alternate = !alternate;
        }
        
        return (total % 10 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de tarjeta: ");
        String number = scanner.nextLine();
        
        if (luhnCheck(number)) {
            System.out.println("Número válido según el algoritmo de Luhn.");
        } else {
            System.out.println("Número inválido según el algoritmo de Luhn.");
        }

        scanner.close();
    }
}
