import java.util.Scanner;

public class CalcularSueldoSemanal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();
        System.out.print("Ingrese el pago por hora: ");
        double pagoPorHora = sc.nextDouble();

        double sueldoSemanal = horasTrabajadas * pagoPorHora;

        System.out.println("Sueldo semanal: " + sueldoSemanal);

        sc.close();
    }
}
