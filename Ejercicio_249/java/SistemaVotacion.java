import java.util.Scanner;

public class SistemaVotacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;

        System.out.println("Ingrese la cantidad de votantes:");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Votación: 1) Candidato A, 2) Candidato B, 3) Candidato C");
            int voto = scanner.nextInt();

            if (voto == 1) votosCandidato1++;
            else if (voto == 2) votosCandidato2++;
            else if (voto == 3) votosCandidato3++;
            else {
                System.out.println("Voto inválido, intente de nuevo.");
                i--;
            }
        }
        scanner.close();

        System.out.println("Resultados finales:");
        System.out.println("Candidato A: " + votosCandidato1 + " votos");
        System.out.println("Candidato B: " + votosCandidato2 + " votos");
        System.out.println("Candidato C: " + votosCandidato3 + " votos");

        if (votosCandidato1 > votosCandidato2 && votosCandidato1 > votosCandidato3)
            System.out.println("El ganador es el Candidato A");
        else if (votosCandidato2 > votosCandidato1 && votosCandidato2 > votosCandidato3)
            System.out.println("El ganador es el Candidato B");
        else if (votosCandidato3 > votosCandidato1 && votosCandidato3 > votosCandidato2)
            System.out.println("El ganador es el Candidato C");
        else
            System.out.println("Hubo un empate");
    }
}
