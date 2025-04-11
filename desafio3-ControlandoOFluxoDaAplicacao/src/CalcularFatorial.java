import java.util.Scanner;

public class CalcularFatorial {
    public static void main(String[] args) {

        // Crie um programa que solicite ao usuário um número e calcule o fatorial desse número

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo a mais uma atividade de matemática!");
        System.out.println("-------------------------------------");
        System.out.print("Digite um número inteiro não negativo: ");

        // Verifica se a próxima entrada é um inteiro
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            // Trata o caso de número negativo
            if (numero < 0) {
                System.out.println("O fatorial não está definido para números negativos.");
            } else {
                long fatorial = 1; // Use long para evitar overflow para números maiores
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                }
                System.out.println("O fatorial de " + numero + " é: " + fatorial);
            }
        } else {
            // Se a entrada não for um inteiro
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            scanner.next(); // Limpa a entrada inválida do scanner
        }

        scanner.close();
    }
}
