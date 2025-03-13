import java.util.Scanner;

public class MultiploDeSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Ingrese un número: ");
            num = sc.nextInt();
        } while (num % 7 != 0);

        System.out.println("El número " + num + " es un múltiplo de 7. Fin del programa.");
        sc.close();
    }
}
