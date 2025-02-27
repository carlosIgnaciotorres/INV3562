import java.util.Scanner;

public class NotasEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota de Programación del Estudiante 1: ");
        double num1_programacion = sc.nextDouble();
        System.out.print("Introduce la nota de Matemáticas del Estudiante 1: ");
        double num1_matematicas = sc.nextDouble();

        System.out.print("Introduce la nota de Programación del Estudiante 2: ");
        double num2_programacion = sc.nextDouble();
        System.out.print("Introduce la nota de Matemáticas del Estudiante 2: ");
        double num2_matematicas = sc.nextDouble();

        System.out.print("Introduce la nota de Programación del Estudiante 3: ");
        double num3_programacion = sc.nextDouble();
        System.out.print("Introduce la nota de Matemáticas del Estudiante 3: ");
        double num3_matematicas = sc.nextDouble();

        double promedio1 = (num1_programacion + num1_matematicas) / 2;
        double promedio2 = (num2_programacion + num2_matematicas) / 2;
        double promedio3 = (num3_programacion + num3_matematicas) / 2;

        if (promedio1 >= 7.5) {
            System.out.println("Estudiante 1: Aprobado con promedio " + promedio1);
        } else {
            System.out.println("Estudiante 1: No Aprobado con promedio " + promedio1);
        }

        if (promedio2 >= 7.5) {
            System.out.println("Estudiante 2: Aprobado con promedio " + promedio2);
        } else {
            System.out.println("Estudiante 2: No Aprobado con promedio " + promedio2);
        }

        if (promedio3 >= 7.5) {
            System.out.println("Estudiante 3: Aprobado con promedio " + promedio3);
        } else {
            System.out.println("Estudiante 3: No Aprobado con promedio " + promedio3);
        }

        sc.close();
    }
}
