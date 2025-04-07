public class Conversao {
    public static void main(String[] args) {
        // Casting implícito (de um tipo menor para um tipo maior)
        int numeroInteiro = 10;
        double numeroDecimal = numeroInteiro; // int é implicitamente convertido para double
        System.out.println("Número inteiro: " + numeroInteiro);
        System.out.println("Número decimal (após casting implícito): " + numeroDecimal);

        System.out.println("--------------------");

        // Casting explícito (de um tipo maior para um tipo menor)
        double outroNumeroDecimal = 10.75;
        int outroNumeroInteiro = (int) outroNumeroDecimal; // double é explicitamente convertido para int (truncamento)
        System.out.println("Número decimal original: " + outroNumeroDecimal);
        System.out.println("Número inteiro (após casting explícito): " + outroNumeroInteiro);
    }
}
