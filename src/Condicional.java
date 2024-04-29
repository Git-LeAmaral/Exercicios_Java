public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2001;
        boolean incluiNoPlano = false;
        double media = (9.8 + 6.3 + 8.0) / 3;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluiNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado para cliente vip");
        } else {
            System.out.println("Você precisa virar vip para assistir sem pagar!");
        }
    }
}
