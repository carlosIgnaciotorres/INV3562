public class Padovan {
    public static void main(String[] args) {
        int[] P = new int[10];
        
        P[0] = 1;
        P[1] = 1;
        P[2] = 1;

        for (int i = 3; i < 10; i++) {
            P[i] = P[i - 2] + P[i - 3];
        }

        System.out.print("Los primeros 10 números de la sucesión de Padovan son: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(P[i] + " ");
        }
    }
}
