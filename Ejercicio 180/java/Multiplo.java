import java.util.Scanner;

public class Multiplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número (A): ");
        int A = sc.nextInt();
        
        System.out.print("Ingrese el segundo número (B): ");
        int B = sc.nextInt();
        
        if (A % B == 0) {
            System.out.println(A + " es múltiplo de " + B);
        } else if (B % A == 0) {
            System.out.println(B + " es múltiplo de " + A);
        } else {
            System.out.println("Ninguno es múltiplo del otro.");
        }
        
        sc.close();
    }
}
