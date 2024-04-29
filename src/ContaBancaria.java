import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = leitura.nextLine();

        System.out.print("Digite o tipo da conta: ");
        String tipoConta = leitura.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoAtual = leitura.nextDouble();

        System.out.println("=============================");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldoAtual);
        System.out.println("\n=============================");

        int escolha = 0;

        while (escolha != 4) {
            System.out.println("======= OPERAÇÕES =======");
            System.out.println("\nOlá " + nome + " digite uma das opções:");
            System.out.println("\n1- CONSULTAR SALDO");
            System.out.println("2- DEPOSITAR");
            System.out.println("3- TRANSFERIR");
            System.out.println("4- SAIR");
            escolha = leitura.nextInt();

            //System.out.println("Digite a opção desejada:");

            if (escolha == 1) {
                System.out.println("Seu saldo atual é de " + saldoAtual);

            } else if (escolha == 2) {
                System.out.print("Insira o valor do depósito: ");
                double valorDeposito = leitura.nextDouble();
                saldoAtual = saldoAtual + valorDeposito;
                System.out.println("Deposito de " + valorDeposito + " realizado com sucesso");

            } else if (escolha == 3) {
                System.out.print("Insira o valor da transferência: ");
                double valorTransferencia = leitura.nextDouble();
                if (valorTransferencia > saldoAtual) {
                    System.out.println("Você não tem saldo suficiente para realizar esta transferência");
                } else {
                    saldoAtual -= valorTransferencia;
                    System.out.println("Transferência de " + valorTransferencia + " realizado com sucesso");
                }

            } else if (escolha != 4) {
                System.out.println("Opção inválida! Tente novamente");
            }
            else {
                System.out.println("Obrigado! Até a próxima.");
            }
        }

    }
}
