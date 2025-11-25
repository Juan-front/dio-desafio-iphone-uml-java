package interfaces;

/**
 * Define os comportamentos de um reprodutor musical.
 */
public interface ReprodutorMusical {

    void tocar();

    void pausar();

    void selecionarMusica(String musica);
}
