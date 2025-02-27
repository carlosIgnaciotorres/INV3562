import java.util.*;

public class SegundoMayor {
    public static int encontrarSegundoMayor(int[] numeros) {
        if (numeros.length < 2) {
            throw new IllegalArgumentException("Se necesitan al menos dos números");
        }

        int primero = Integer.MIN_VALUE, segundo = Integer.MIN_VALUE;

        for (int num : numeros) {
            if (num > primero) {
                segundo = primero;
                primero = num;
            } else if (num > segundo && num < primero) {
                segundo = num;
            }
        }

        if (segundo == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No hay un segundo número mayor válido");
        }

        return segundo;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 5, 30, 25};
        System.out.println("El segundo número mayor es: " + encontrarSegundoMayor(numeros));
    }
}
