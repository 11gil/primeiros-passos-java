import java.util.Scanner;

// Crie um programa que solicite ao usuário digitar um número
// Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número é zero ou negativo"

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {

        // Declaração da variável
        int numero = 0;

        Scanner scanner = new Scanner(System.in); // Scanner para obter os dados do usuário via teclado

        System.out.println("Bem-vindo ao Jogo do número positivo ou negativo!");
        System.out.println("-----------------------------------------");

        System.out.println("Insira um número:");
        if (scanner.hasNextInt()) { // Verifica se a próxima entrada é um inteiro
            numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("O número " + numero + " é positivo.");
            } else {
                System.out.println("O número " + numero + " é zero ou negativo.");
            }

        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }
        System.out.println("-----------------------------------------");

        scanner.close(); // Boa prática: fechar o scanner
    }
}
