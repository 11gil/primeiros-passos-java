import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // nome mais claro

        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite a sua avaliação para o filme:");
            nota = scanner.nextDouble();
            mediaAvaliacao += nota;

        }

        System.out.println("A média de Avaliação: " + mediaAvaliacao/3);
        // A aplicação foi acumulando as notas, fez a média das avaliações e nos retorna o valor impresso.
    }
}
