import java.util.Scanner;

public class BuscarValorEnLista {
    public static void main(String[] args) {
        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor a buscar: ");
        int valorBuscar = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == valorBuscar) {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("El valor se encontró " + contador + " veces.");
        } else {
            System.out.println("El valor no se encontró en la lista.");
        }
    }
}
