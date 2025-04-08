public class DescontoNoPreco {
    public static void main(String[] args) {
        // Declare uma variável do tipo double precoOriginal.
        // Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginalReais = 8.90;
        double percentualDesconto = 10;
        double calculoValorDesconto = ((precoOriginalReais * percentualDesconto) / 100);
        double precoComDesconto = (precoOriginalReais-calculoValorDesconto);
        System.out.println("Preço com desconto: R$ " + precoComDesconto);

    }
}
