import java.util.Scanner;

public class PromedioPonderasdo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double valor1, peso1, valor2, peso2, valor3, peso3, suma_productos, suma_pesos, promedio_ponderado;
        
        System.out.print("Introduce el valor y el peso de la primera actividad: ");
        valor1 = sc.nextDouble();
        peso1 = sc.nextDouble();
        
        System.out.print("Introduce el valor y el peso de la segunda actividad: ");
        valor2 = sc.nextDouble();
        peso2 = sc.nextDouble();
        
        System.out.print("Introduce el valor y el peso de la tercera actividad: ");
        valor3 = sc.nextDouble();
        peso3 = sc.nextDouble();
        
        suma_productos = (valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3);
        suma_pesos = peso1 + peso2 + peso3;
        
        promedio_ponderado = suma_productos / suma_pesos;
        
        System.out.println("El promedio ponderado es: " + promedio_ponderado);
    }
}
