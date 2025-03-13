import java.util.Scanner;

public class NumeroCercanoMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[5];
        double suma = 0;

        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double media = suma / 5;
        double masCercano = numeros[0];
        double diferenciaMin = Math.abs(numeros[0] - media);

        for (int i = 1; i < 5; i++) {
            double diferencia = Math.abs(numeros[i] - media);
            if (diferencia < diferenciaMin) {
                diferenciaMin = diferencia;
                masCercano = numeros[i];
            }
        }

        System.out.println("La media es: " + media);
        System.out.println("El número más cercano a la media es: " + masCercano);

        sc.close();
    }
}
