public class DollarParaRealComCasting {
    public static void main(String[] args) {
        double dollar = 10.50;
        double cotacaoDolar = 5.84;
        double realDouble = dollar * cotacaoDolar;
        int realInteiro = (int) realDouble; // Casting para int (perde a parte decimal)

        System.out.println("Valor total em Reais (com casas decimais): R$ " + realDouble);
        System.out.println("Valor total em Reais (parte inteira): R$ " + realInteiro);
    }
}
