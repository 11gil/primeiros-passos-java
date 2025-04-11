import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // nome mais claro

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite a sua avaliação para o filme ou -1 para encerrar:");
            nota = scanner.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;

                System.out.println("A média de Avaliação: " + mediaAvaliacao/totalDeNotas);
                // A aplicação foi acumulando as notas, fez a média das avaliações e nos retorna o valor impresso.

            } else {
                System.out.println("Obrigado pela participação!");
            }

        }


    }
}
