import java.util.Scanner;

public class PrimoGemelo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();
        
        if (esPrimo(n) && esPrimo(n + 2)) {
            System.out.println(n + " y " + (n + 2) + " son primos gemelos.");
        } else {
            System.out.println(n + " no es parte de un par de primos gemelos.");
        }
        
        sc.close();
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
