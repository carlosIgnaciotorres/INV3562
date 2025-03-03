import java.util.Scanner;

public class ValidarLongitudTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto;

        do {
            System.out.print("Ingrese un texto (mínimo 6 caracteres): ");
            texto = scanner.nextLine();
        } while (texto.length() < 6);

        System.out.println("Texto aceptado");
        scanner.close();
    }
}
