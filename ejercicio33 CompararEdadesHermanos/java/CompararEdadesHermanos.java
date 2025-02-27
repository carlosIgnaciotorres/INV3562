import java.util.Scanner;

public class CompararEdadesHermanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Ingrese la edad del primer hermano: ");
        int edadHermano1 = scanner.nextInt();

        System.out.print("Ingrese la edad del segundo hermano: ");
        int edadHermano2 = scanner.nextInt();

       
        if (edadHermano1 > edadHermano2) {
            int diferencia = edadHermano1 - edadHermano2;
            System.out.println("El hermano mayor tiene " + edadHermano1 + " años.");
            System.out.println("La diferencia de edad es de " + diferencia + " años.");
        } else if (edadHermano2 > edadHermano1) {
            int diferencia = edadHermano2 - edadHermano1;
            System.out.println("El hermano mayor tiene " + edadHermano2 + " años.");
            System.out.println("La diferencia de edad es de " + diferencia + " años.");
        } else {
            System.out.println("Ambos hermanos tienen la misma edad.");
        }

        scanner.close();
    }
}
