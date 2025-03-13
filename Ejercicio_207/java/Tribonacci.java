import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de la sucesión de Tribonacci a generar: ");
        int N = sc.nextInt();
        sc.close();

        int a = 0, b = 1, c = 1, trib;
        
        if (N >= 1) System.out.print(a + " ");
        if (N >= 2) System.out.print(b + " ");
        if (N >= 3) System.out.print(c + " ");
        
        for (int i = 4; i <= N; i++) {
            trib = a + b + c;
            System.out.print(trib + " ");
            a = b;
            b = c;
            c = trib;
        }
    }
}
