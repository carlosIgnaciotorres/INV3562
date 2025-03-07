import java.util.Scanner;

public class SumaDeParesEnRango {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa el valor de n: ");
        int n = scanner.nextInt();
        
        System.out.print("Ingresa el valor de m: ");
        int m = scanner.nextInt();
        
        if (n > m) {
            System.out.println("Error: n debe ser menor o igual a m");
        } else {
            int suma = 0;
            int contador = n;
            while (contador <= m) {
                if (contador % 2 == 0) {
                    suma += contador;
                }
                contador++;
            }
            System.out.println("La suma de los números pares en el rango es: " + suma);
        }
        
        scanner.close();
    }
}
