import java.util.Random;

public class LanzarDado {
    public static void main(String[] args) {
        Random random = new Random();
        int dado = random.nextInt(6) + 1;
        System.out.println("El resultado del dado es: " + dado);
    }
}
