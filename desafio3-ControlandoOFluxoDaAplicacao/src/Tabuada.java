import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10

        // Declaração de variáveis
        int numero = 0;

        Scanner scanner = new Scanner(System.in); // Scanner para obter os dados do usuário via teclado

        System.out.println("Bem-vindo a atividade de matemática!");
        System.out.println("-------------------------------------");
        System.out.println("Informe um número inteiro para conhecer a tabuada:");

        // Certifica-se de que a entrada do usuário é um inteiro
        if (scanner.hasNextInt()) {
            numero = scanner.nextInt();
            System.out.println("Tabuada do: " + numero);

            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));

            }

        } else {
            System.out.println("Entrada inválida. Por favor, execute novamente o código digitando um número inteiro.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }

        System.out.println("-------------------------------------");
        scanner.close(); // Boa prática: fechar o scanner

    }

}
