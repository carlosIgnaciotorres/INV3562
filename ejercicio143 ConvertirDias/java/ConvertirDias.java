import java.util.Scanner;

public class ConvertirDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de días: ");
        int dias = sc.nextInt();

        int semanas = dias / 7;
        int diasRestantes = dias % 7;

        System.out.println("Semanas completas: " + semanas);
        System.out.println("Días restantes: " + diasRestantes);
        
        sc.close();
    }
}
