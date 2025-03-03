import java.util.Scanner;

public class PedirNumeroMayorQueCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numero = sc.nextDouble();
        
        while (numero <= 0) {
            numero = sc.nextDouble();
        }
    }
}
