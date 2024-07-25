package dev.ericamila.iphone;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Deus de promessas");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("(11) 4002-8922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://github.com/ericamila");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
