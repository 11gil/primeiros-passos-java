import java.util.Scanner;

public class LeituraDeDadosViaTeclado {
    public static <Int> void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // nome mais claro
        System.out.println("Digite o nome de um filme:");
        String filme = scanner.nextLine();

        System.out.println("Digite o ano de lançamento:");
        int ano = scanner.nextInt();

        System.out.println("Digite a sua avaliação para o filme:");
        double avaliacao = scanner.nextDouble();

        System.out.println("Filme digitado:" + filme);
        System.out.println("Ano digitado: " + ano);
        System.out.println("Avaliação digitado: " + avaliacao);

        // A classe Scanner do Java é utilizada para ler dados de entrada em programa Java. Esses dados podem ser lidos a partir de várias fontes de entrada, como arquivos, fluxos de entrada, Strings e até mesmo a entrada do usuário através do teclado, como vimos em aula.
        //
        //Ela oferece uma série de métodos para ler dados de diferentes tipos, como inteiros, números de ponto flutuante, strings e caracteres.
        //
        //Para utilizar a classe Scanner, primeiro é necessário importá-la no início do seu programa. Provavelmente ao incluir a mesma no código, a IDE já vai sugerir o import.


    }
}

