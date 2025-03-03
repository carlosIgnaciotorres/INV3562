import java.util.Scanner;

public class SumarDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese un número entero positivo de 3 cifras: ");
        int numero = scanner.nextInt();

        
        int centenas = numero / 100;
        int decenas = (numero % 100) / 10;
        int unidades = numero % 10;

        
        int suma = centenas + decenas + unidades;

       
        System.out.println("La suma de los dígitos es: " + suma);

        scanner.close();
    }
}
