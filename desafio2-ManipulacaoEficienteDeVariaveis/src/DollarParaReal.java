public class DollarParaReal {
        public static void main (String [] args) {
            // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
            // Considere que o valor de 1 dólar é equivalente a 4.94 reais.
            // Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

            double valorEmDolares = 10;
            double cotacaoDoDollar = 5.84;
            double realDouble = (valorEmDolares * cotacaoDoDollar);
            int realInteiro = (int) realDouble; // Casting para int (perde a parte decimal)

            System.out.println("Valor total em Reais (com casas decimais): R$ " + realDouble);
            System.out.println("Valor total em Reais (parte inteira): R$ " + realInteiro);


            // double dollar = 10.50;
            // double cotacaoDolar = 5.84;
            // double realDouble = dollar * cotacaoDolar;
            // int realInteiro = (int) realDouble; // Casting para int (perde a parte decimal)
            //
            // System.out.println("Valor total em Reais (com casas decimais): R$ " + realDouble);
            // System.out.println("Valor total em Reais (parte inteira): R$ " + realInteiro);

        }
}
