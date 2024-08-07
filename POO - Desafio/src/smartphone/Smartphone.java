package smartphone;

import smartphone.iphone.Iphone;

public class Smartphone {
    public static void main(String[] args) {
        Iphone ip = new Iphone();

        ip.tocar();
        ip.pausar();
        ip.selecionarMusica("Kendrick Lamar - Not Like Us");
        ip.ligar("(11)40028-9224");
        ip.atender();
        ip.iniciarCorreioVoz();
        ip.adicionarNovaAba();
        ip.atualizarPagina();
    }
}
