package interfaces;

/**
 * Define os comportamentos de um navegador de internet.
 */
public interface NavegadorInternet {

    void exibirPagina(String url);

    void adicionarNovaAba();

    void atualizarPagina();
}
