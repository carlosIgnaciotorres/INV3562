import java.util.Scanner;

public class CalculoTotalCamisas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de camisas: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el precio por camisa: ");
        double precio = scanner.nextDouble();

        double total;
        
        if (cantidad >= 3) {
            total = (cantidad * precio) * 0.80;
        } else {
            total = (cantidad * precio) * 0.90;
       
