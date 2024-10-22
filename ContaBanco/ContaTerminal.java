import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // solicita e rece os dados do usuario
        System.out.println("Por favor, digite o numero da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o numero da Agencia:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // define saldo
        double saldo = 237.48;

        // mensagem de confirmaçao
        String mensagem = "ola, " + nomeCliente + " obrigado por criar uma conta em nosso banco," 
                + " sua agencia e " + agencia + ", conta " + numero + " e seu saldo "
                + saldo + " ja esta disponivel para saque.";

        System.out.println(mensagem);

        scanner.close();

    }

}