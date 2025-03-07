import java.util.Scanner;

public class CalculosConDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        
        double suma = numero1 + numero2;

       
        double cociente = numero1 / numero2;

       
        double residuo = numero1 % numero2;

       
        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("El cociente de los dos números es: " + cociente);
        System.out.println("El residuo de la división es: " + residuo);

        scanner.close();
    }
}
