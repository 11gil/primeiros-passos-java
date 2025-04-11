import java.util.Scanner;

public class CompareOsNumeros {
    public static void main(String[] args) {
        // Peça ao usuário para inserir dois números inteiros.
        // Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        // Declaração das variáveis
        int primeiroNumero = 0;
        int segundoNumero = 0;

        Scanner scanner = new Scanner(System.in); // Scanner para obter os dados do usuário via teclado

        System.out.println("Bem-vindo ao Jogo de comparação de dois números inteiros!");
        System.out.println("-----------------------------------------");

        System.out.println("Insira o primeiro número inteiro:");
        if (scanner.hasNextInt()) { // Verifica se a próxima entrada é um inteiro
            primeiroNumero = scanner.nextInt();

            System.out.println("Insira o segundo número inteiro:");
            if (scanner.hasNextInt()) { // Verifica se a próxima entrada é um inteiro
                segundoNumero = scanner.nextInt();

                // Bloco de comparação dos números
                if (primeiroNumero == segundoNumero) {
                    System.out.println(primeiroNumero + " é igual a " + segundoNumero);
                } else if (primeiroNumero > segundoNumero) {
                    System.out.println(primeiroNumero + " é maior que " + segundoNumero);
                } else {
                    System.out.println(primeiroNumero + " é menor que " + segundoNumero);
                }

            } else {
                System.out.println("Entrada inválida para o segundo número. Por favor, digite um número inteiro.");
                scanner.next(); // Limpa a entrada inválida do scanner
            }

        } else {
            System.out.println("Entrada inválida para o primeiro número. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }
        System.out.println("-----------------------------------------");

        scanner.close(); // Boa prática: fechar o scanner

    }
}
