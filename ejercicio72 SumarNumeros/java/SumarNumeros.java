import java.util.Scanner;

public class SumarNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        int resultado = sumar(num1, num2);
        System.out.println("La suma es: " + resultado);
    }

    static int sumar(int a, int b) {
        return a + b;
    }
}
