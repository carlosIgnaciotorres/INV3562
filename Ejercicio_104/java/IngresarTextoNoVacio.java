import java.util.Scanner;

public class IngresarTextoNoVacio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String texto = sc.nextLine();
        
        while (texto.isEmpty()) {
            texto = sc.nextLine();
        }
    }
}
