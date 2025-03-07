import java.util.Scanner;

public class MenorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la nota N1: ");
        double N1 = scanner.nextDouble();
        System.out.print("Ingresa la nota N2: ");
        double N2 = scanner.nextDouble();
        System.out.print("Ingresa la nota N3: ");
        double N3 = scanner.nextDouble();
        System.out.print("Ingresa la nota N4: ");
        double N4 = scanner.nextDouble();
        System.out.print("Ingresa la nota del Examen de Medio Curso (EMC): ");
        double EMC = scanner.nextDouble();
        System.out.print("Ingresa la nota del Examen Final: ");
        double NotaFIN = scanner.nextDouble();
        double menorNota = N1;
        if (N2 < menorNota) menorNota = N2;
        if (N3 < menorNota) menorNota = N3;
        if (N4 < menorNota) menorNota = N4;
        if (EMC < menorNota) menorNota = EMC;
        if (NotaFIN < menorNota) menorNota = NotaFIN;
        System.out.println("La menor nota es: " + menorNota);
    }
}
