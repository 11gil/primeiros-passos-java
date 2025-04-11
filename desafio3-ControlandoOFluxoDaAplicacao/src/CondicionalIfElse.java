public class CondicionalIfElse {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que o pessoal está curtindo.");
        } else {
            System.out.println("Filme retrô que vale a pena assistir.");
        }
        if (incluidoNoPlano = true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado!");

        } else {
            System.out.println("Deve pagar a locação!");
        }

        
    }
}