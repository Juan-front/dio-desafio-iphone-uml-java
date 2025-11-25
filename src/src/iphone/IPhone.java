package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

/**
 * Classe que representa um iPhone que desempenha
 * os papéis de Reprodutor Musical, Aparelho Telefônico
 * e Navegador na Internet.
 */
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    /* ================== ReprodutorMusical ================== */

    @Override
    public void tocar() {
        System.out.println("🎵 Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("⏸ Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("📻 Selecionando música: " + musica);
    }

    /* ================== AparelhoTelefonico ================== */

    @Override
    public void ligar(String numero) {
        System.out.println("📞 Ligando para " + numero + "...");
    }

    @Override
    public void atender() {
        System.out.println("📲 Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("📨 Iniciando correio de voz...");
    }

    /* ================== NavegadorInternet ================== */

    @Override
    public void exibirPagina(String url) {
        System.out.println("🌐 Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("🆕 Adicionando nova aba no navegador.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("🔄 Atualizando página atual.");
    }

    /* ================== Método main (demonstração) ================== */

    public static void main(String[] args) {

        IPhone meuIPhone = new IPhone();

        System.out.println("=== Testando Reprodutor Musical ===");
        meuIPhone.selecionarMusica("Bohemian Rhapsody");
        meuIPhone.tocar();
        meuIPhone.pausar();

        System.out.println("\n=== Testando Aparelho Telefônico ===");
        meuIPhone.ligar("(13) 99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        System.out.println("\n=== Testando Navegador na Internet ===");
        meuIPhone.exibirPagina("https://web.dio.me");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}
