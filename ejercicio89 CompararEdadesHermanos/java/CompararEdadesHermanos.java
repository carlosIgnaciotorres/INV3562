import java.util.Scanner;

public class CompararEdadesHermanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la edad del primer hermano: ");
        int edadHermano1 = scanner.nextInt();

        System.out.print("Ingresa la edad del segundo hermano: ");
        int edadHermano2 = scanner.nextInt();

        int mayor, menor;

        if (edadHermano1 > edadHermano2) {
            mayor = edadHermano1;
            menor = edadHermano2;
        } else {
            mayor = edadHermano2;
            menor = edadHermano1;
        }

        int diferencia = mayor - menor;

        System.out.println("El hermano mayor tiene: " + mayor + " años.");
        System.out.println("La diferencia de edades es de: " + diferencia + " años.");
    }
}
