package smartphone.iphone;

import smartphone.funcionalidades.AparelhoTelefonico;
import smartphone.funcionalidades.NavegadorNaInternet;
import smartphone.funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música!");
    }

    public void pausar() {
        System.out.println("Pausando.");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " Selecionada");
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);

    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz...bipi");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina do url: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
        System.out.println("Pagina atualizada!");
        ;
    }

}
