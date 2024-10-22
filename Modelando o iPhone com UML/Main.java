public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Testando o Reprodutor Musical
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Testando o Aparelho Telefônico
        meuIPhone.ligar("123-456-789");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIPhone.exibirPagina("https://www.example.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
