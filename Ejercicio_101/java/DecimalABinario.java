import java.util.Scanner;

public class DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero_decimal = sc.nextInt();
        String binario = "";

        while (numero_decimal > 0) {
            int residuo = numero_decimal % 2;
            binario = residuo + binario;
            numero_decimal = numero_decimal / 2;
        }

        System.out.println("El número binario es: " + binario);
    }
}
