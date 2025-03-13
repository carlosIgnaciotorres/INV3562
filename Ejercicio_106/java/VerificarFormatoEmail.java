import java.util.Scanner;

public class VerificarFormatoEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String email = sc.nextLine();
        
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Formato de email correcto.");
        } else {
            System.out.println("Formato de email incorrecto.");
        }
    }
}
