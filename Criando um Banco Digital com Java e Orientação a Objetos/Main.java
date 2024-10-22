public class Main {
    public static void main(String[] args) {
        Cliente elias = new Cliente();
        elias.setNome("Elias Wolk");

        Conta cc = new ContaCorrente(elias);
        Conta poupanca = new ContaPoupanca(elias);

        cc.depositar(100);
        cc.transferir(50, poupanca);

        cc.imprimirInfosComuns();
        poupanca.imprimirInfosComuns();
    }
}
