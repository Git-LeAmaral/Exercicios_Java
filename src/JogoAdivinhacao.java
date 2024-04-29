import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas < 5) {
            System.out.print("Digite um número entre 0 e 100: ");
            numeroDigitado = leitura.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns você acertou o número!");
                break;
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O número que digitou é menor que o número gerado");
                System.out.println("Tentativas " + tentativas);
            } else {
                System.out.println("O número que digitou é maior que o número gerado");
                System.out.println("Tentativas " + tentativas);
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Tentativas esgotadas, o número gerado era: " + numeroGerado);
        }
    }
}
