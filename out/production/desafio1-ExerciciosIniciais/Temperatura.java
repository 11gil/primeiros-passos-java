public class Temperatura {
    public static void main(String[] args) {
        // Convertendo temperaturas graus Celsius para Fahrenheit.
        double celsius = 25.5;
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Conversão de grau Celsius para Fahrenheit: " + fahrenheit);

        // Aplicando um casting explícito para int após o cálculo.
        int fahrenheitInteiro = (int) fahrenheit;
        System.out.println("Conversão de grau Celsius para Fahrenheit com valor inteiro: " + fahrenheitInteiro);
    }
}
