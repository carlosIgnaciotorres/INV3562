import java.util.Scanner;

public class DecimalABinario {
    public static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        }

        String binario = "";
        while (numero > 0) {
            int residuo = numero % 2;
            binario = residuo + binario;
            numero /= 2;
        }
        
        return binario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número decimal: ");
        int numero = scanner.nextInt();
        scanner.close();
        
        System.out.println("El número binario es: " + decimalABinario(numero));
    }
}
