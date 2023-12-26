package projetoIphone.celular;

import projetoIphone.apps.aparelhoTelefonico;
import projetoIphone.apps.navegadorInternet;
import projetoIphone.apps.reprodutorMusical;

public class celular implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA PELO REPRODUTOR MUSICAL");
    }

    @Override
    public void pausar() {
        System.out.println("MUSICA PAUSADA NO APLICATIVO DE MUSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("USUARIO SELECIONANDO MUSICA");
    }

    @Override
    public void exibirPagina() {
        System.out.println("NAVEGADOR DE INTERNET EXIBINDO PÁGINA");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NAVEGADOR DE INTERNET ADICIONANDO UMA NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("NAVEGADOR ATUALIZANDO A PÁGINA");
    }

    @Override
    public void ligar() {
        System.out.println("TELEFONE FAZENDO CHAMADA");
    }

    @Override
    public void atender() {
        System.out.println("TELEFONE ATENDENDO CHAMADA");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("TELEFONE INICIANDO CORREIO DE VOZ");
    }
    
}
