import java.util.Scanner;

public class VerificarNumeroParOuImpar {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário a entrada de um número inteiro.
        // Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        // Declaração de variável
        int numero = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a mais uma atividade de matemática!");
        System.out.println("-------------------------------------");
        System.out.println("Informe um número inteiro para saber se é Par ou Ímpar:");

        // Certifica-se de que a entrada do usuário é um inteiro
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt();
            System.out.println("Número digitado: " + numero);

            if (numero % 2 == 0) {
                System.out.println(numero + " é um número par.");
            } else {
                System.out.println(numero + " é um número ímpar.");
            }

        } else {
            System.out.println("Entrada inválida. Por favor, execute novamente o código digitando um número inteiro.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }

        System.out.println("-------------------------------------");
        scanner.close(); // Boa prática: fechar o scanner

    }
}
