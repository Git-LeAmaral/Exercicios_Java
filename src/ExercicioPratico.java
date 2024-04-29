import java.util.Scanner;

public class ExercicioPratico {
    public static void main(String[] args) {


        Scanner leitura = new Scanner(System.in);

        /*
        // PRIMEIRO

        System.out.print("Digite um número: ");
        int numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }


        // SEGUNDO
        System.out.print("Insira o primeiro numero: ");
        int nuemro1 = leitura.nextInt();

        System.out.print("Insira o segundo numero: ");
        int nuemro2 = leitura.nextInt();

        if (nuemro1 == nuemro2) {
            System.out.println("Os numeros são iguais");
        } else if (nuemro1 > nuemro2) {
            System.out.println("O numero " + nuemro1 + " é maior que o numero " + nuemro2);
        } else {
            System.out.println("O numero " + nuemro1 + " é menor que o numero " + nuemro2);
        }



        // TERCEIRO

        System.out.println("==== Selecione uma das opções: ====");

        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----MENU-----");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do circulo");
            System.out.println("3. Sair");
            escolha = leitura.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o numero para o calculo do quadrado: ");
                double lado = leitura.nextDouble();
                double areaDoQuadrado = lado * lado;

                System.out.println("Area do quadrado: " + areaDoQuadrado);
            } else if (escolha == 2) {
                System.out.print("Digite o raio do circulo: ");
                double raio = leitura.nextDouble();
                double areaDoCirculo = 3.14 * raio * raio;
                System.out.println("Area do circulo: " + areaDoCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção invalida. Tente novamente.");
            }
        }

         */


        // QUARTO

        System.out.print("Insira o numero da tabuada: ");
        int numeroTabuada = leitura.nextInt();

        System.out.println("Tabuada do " + numeroTabuada + ":");
        for (int i = 0;  i < 11; i++) {
            System.out.println(numeroTabuada + " X " + i + " = " + (numeroTabuada * i));
        }
    }
}
