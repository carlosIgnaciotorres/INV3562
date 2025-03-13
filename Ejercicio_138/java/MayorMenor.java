import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int N = sc.nextInt();
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int mayor = numero, menor = numero;

        for (int i = 1; i < N; i++) {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);
        sc.close();
    }
}
