import java.util.Arrays;
import java.util.Random;

public class CalcularMediana {
    public static void main(String[] args) {
        int[] lista = new int[20];
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            lista[i] = rand.nextInt(100) + 1;
        }

        Arrays.sort(lista);

        double mediana;
        if (lista.length % 2 == 0) {
            mediana = (lista[9] + lista[10]) / 2.0;
        } else {
            mediana = lista[10];
        }

        System.out.println("La lista ordenada es: " + Arrays.toString(lista));
        System.out.println("La mediana de los números generados es: " + mediana);
    }
}
