import java.util.Scanner; // Importar a classe Scanner - Necessário para obter dados do usuário via teclado
import java.util.Random;  // Importar a classe Random - Necessário para usar Random

public class JogoDeAdivinhacao {
    public static void main(String[] args) {

        // Declaração das variáveis
        int tentativas = 5;
        Random random = new Random(); // Cria uma instância de Random fora do loop
        int numeroAleatorio = random.nextInt(100); // Número entre 0 e 99
        int numeroUsuario = 0;

        Scanner scanner = new Scanner(System.in); // Scanner para obter os dados do usuário via teclado

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 99.");
        System.out.println("Você tem " + tentativas + " tentativas.");
        System.out.println("-----------------------------------------");

        // Enquanto houver tentativas
        while (tentativas > 0) {
            System.out.println("Insira o seu número (Tentativas restantes: " + tentativas + "):");
            if (scanner.hasNextInt()) { // Verifica se a próxima entrada é um inteiro
                numeroUsuario = scanner.nextInt();

                if (numeroUsuario == numeroAleatorio) {
                    System.out.println("Parabéns! Você adivinhou o número: " + numeroAleatorio);
                    break; // Sai do loop se acertar
                } else if (numeroUsuario < numeroAleatorio) {
                    System.out.println("O número digitado é menor.");
                } else {
                    System.out.println("O número digitado é maior.");
                }

                tentativas--; // Diminui uma tentativa após a verificação (em qualquer caso de erro)
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida do scanner
            }
            System.out.println("-----------------------------------------");
        }

        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram! O número correto era: " + numeroAleatorio);
        }

        scanner.close(); // Boa prática: fechar o scanner
    }
}

