import java.util.Scanner;

public class ConvertirKM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad en kilómetros: ");
        double kilometros = sc.nextDouble();
        double metros = kilometros * 1000;
        double centimetros = kilometros * 100000;
        System.out.println("Metros: " + metros);
        System.out.println("Centímetros: " + centimetros);
        sc.close();
    }
}
