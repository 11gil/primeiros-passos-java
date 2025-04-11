import java.util.Scanner;

public class CalcularAreaQuadradoOuCirculo {
    public static void main(String[] args) {

        // Crie um menu que oferece duas opções ao usuário:
        // "1. Calcular área do quadrado" e
        // "2. Calcular área do círculo".
        // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
        // Área do quadrado = lado x lado =  lado^2
        // Área do círculo = π x raio^2 (π (pi) é uma constante matemática aproximadamente igual a 3.14159.)

        // Declaração das variáveis
        double lado = 0;
        double raio = 0;
        int opcao = 0;
        final double PI = 3.14159; // Declaração da constante PI (boa prática)

        Scanner scanner = new Scanner(System.in); // Scanner para obter os dados do usuário via teclado

        System.out.println("Bem-vindo a atividade de matemática!");
        System.out.println("-------------------------------------");
        System.out.println("Escolha uma das opções abaixo para cálculo:");
        System.out.println("(1) para área do quadrado ou (2) para área do círculo");

        // Certifica-se de que a entrada do usuário é um inteiro
        if (scanner.hasNextInt()) {
            opcao = scanner.nextInt();
            System.out.println("Opção escolhida: " + opcao);

            switch (opcao) {
                case 1: // Caso o usuário escolha 1 (calcular área do quadrado)
                    System.out.println("Digite o lado do quadrado:");
                    // Certifica-se de que a entrada do lado é um número double
                    if (scanner.hasNextDouble()) {
                        lado = scanner.nextDouble();
                        double areaQuadrado = lado * lado;
                        System.out.println("A área do quadrado é: " + areaQuadrado);
                    } else {
                        System.out.println("Entrada inválida para o lado. Por favor, digite um número.");
                        scanner.next(); // Limpa a entrada inválida do scanner
                    }
                    break; // Importante para sair do 'switch' após a execução do 'case'

                case 2: // Caso o usuário escolha 2 (calcular área do círculo)
                    System.out.println("Digite o raio do círculo:");
                    // Certifica-se de que a entrada do raio é um número double
                    if (scanner.hasNextDouble()) {
                        raio = scanner.nextDouble();
                        double areaCirculo = PI * raio * raio; // Usa a constante PI
                        System.out.println("A área do círculo é: " + areaCirculo);
                    } else {
                        System.out.println("Entrada inválida para o raio. Por favor, digite um número.");
                        scanner.next(); // Limpa a entrada inválida do scanner
                    }
                    break; // Importante para sair do 'switch' após a execução do 'case'

                default: // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
            }

        } else {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro para a opção.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }

        System.out.println("-------------------------------------");
        scanner.close(); // Boa prática: fechar o scanner
    }
}
