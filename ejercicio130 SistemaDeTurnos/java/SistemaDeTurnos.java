import java.util.Scanner;

public class SistemaDeTurnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int turno = 0;
        String continuar = "s";

        while (continuar.equals("s")) {
            turno += 1;
            System.out.println("Tu número de turno es: " + turno);
            System.out.print("¿Deseas continuar asignando turnos? (s/n): ");
            continuar = sc.next();
        }
    }
}
