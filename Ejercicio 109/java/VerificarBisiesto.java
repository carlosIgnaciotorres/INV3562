import java.util.Scanner;

public class VerificarBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año: ");
        int año = scanner.nextInt();

        if (año % 4 == 0) {
            if (año % 100 == 0) {
                if (año % 400 == 0) {
                    System.out.println("El año es bisiesto");
                } else {
                    System.out.println("El año no es bisiesto");
                }
            } else {
                System.out.println("El año es bisiesto");
            }
        } else {
            System.out.println("El año no es bisiesto");
        }

        scanner.close();
    }
}
