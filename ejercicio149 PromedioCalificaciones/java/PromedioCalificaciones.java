public class PromedioCalificaciones {
    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 78};
        int suma = 0;

        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = (double) suma / calificaciones.length;
        String resultado = (promedio > 70) ? "Aprobado" : "Reprobado";

        System.out.println("El promedio es: " + promedio);
        System.out.println("Resultado: " + resultado);
    }
}