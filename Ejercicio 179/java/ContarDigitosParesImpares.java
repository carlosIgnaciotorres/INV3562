import java.util.Scanner;

public class ContarDigitosParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int N = sc.nextInt();
        
        int contadorPares = 0, contadorImpares = 0;
        
        while (N > 0) {
            int digito = N % 10;
            if (digito % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
            N /= 10;
        }
        
        if (contadorPares > contadorImpares) {
            System.out.println("El número tiene más dígitos pares.");
        } else if (contadorImpares > contadorPares) {
            System.out.println("El número tiene más dígitos impares.");
        } else {
            System.out.println("El número tiene igual cantidad de dígitos pares e impares.");
        }
        
        sc.close();
    }
}
