import java.util.Scanner;

public class NumeroCapicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String numero = sc.next();

        String numeroInvertido = new StringBuilder(numero).reverse().toString();

        if (numero.equals(numeroInvertido)) {
            System.out.println("El número es capicúa");
        } else {
            System.out.println("El número NO es capicúa");
        }

        sc.close();
    }
}
