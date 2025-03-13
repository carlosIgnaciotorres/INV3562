import java.util.Scanner;

public class SumarDigitosParesImpares {
    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        
        int sumaPares = 0, sumaImpares = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                sumaPares += sumaDigitos(num);
            } else {
                sumaImpares += sumaDigitos(num);
            }
        }

        System.out.println("Suma de los dígitos de los números pares: " + sumaPares);
        System.out.println("Suma de los dígitos de los números impares: " + sumaImpares);
        
        scanner.close();
    }
}
