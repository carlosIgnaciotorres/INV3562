import java.util.Scanner;

public class Multiplo3y7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero % 3 == 0 && numero % 7 == 0) {
            System.out.println("El número es múltiplo de 3 y 7");
        } else {
            System.out.println("El número NO es múltiplo de 3 y 7");
        }
        
        sc.close();
    }
}
