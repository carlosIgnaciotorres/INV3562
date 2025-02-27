import java.util.Scanner;

public class TablaDel9 {
    public static void main(String[] args) {
        int multiplicador = 9;
        int n = 1;
        int resultado;

        while (n <= 10) {
            resultado = multiplicador * n;
            System.out.println(multiplicador + " x " + n + " = " + resultado);
            n++;
        }
    }
}
