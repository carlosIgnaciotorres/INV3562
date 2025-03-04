import java.util.Scanner;

public class NumeroArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num = sc.nextInt();
        
        int original = num, suma = 0, num_digitos = 0, aux = num;

        while (aux > 0) {
            num_digitos++;
            aux /= 10;
        }

        aux = num;
        while (aux > 0) {
            int digito = aux % 10;
            int potencia = 1;
            for (int i = 0; i < num_digitos; i++) {
                potencia *= digito;
            }
            suma += potencia;
            aux /= 10;
        }

        if (suma == original) {
            System.out.println(original + " es un número de Armstrong.");
        } else {
            System.out.println(original + " no es un número de Armstrong.");
        }

        sc.close();
    }
}
