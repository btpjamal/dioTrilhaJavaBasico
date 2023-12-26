package projetoIphone.usuario;

import projetoIphone.apps.aparelhoTelefonico;
import projetoIphone.apps.navegadorInternet;
import projetoIphone.apps.reprodutorMusical;
import projetoIphone.celular.celular;
import java.util.Scanner;

public class usuario {
    public static void main(String[] args) {
        celular iphone= new celular();
        aparelhoTelefonico telefone = iphone;
        navegadorInternet navegador = iphone;
        reprodutorMusical reprodutorMusical = iphone;
        Scanner scan= new Scanner(System.in);
        System.out.println("usuario, escolha uma funcionalidade do aparelho celular");
        String escolhaUsuario= scan.nextLine();
        
        
        if(escolhaUsuario.equals("telefone")){
            System.out.println("escolha a funcionalidade do aplicativo 'telefone'");
            escolhaUsuario= scan.nextLine();
            if (escolhaUsuario.equals("ligar")) {
                iphone.ligar();
            }
            else if(escolhaUsuario.equals("atender")){
                iphone.atender();
            }
            else if(escolhaUsuario.equals("correio de voz")){
                iphone.iniciarCorreioVoz();
            }
        }
        else if(escolhaUsuario.equals("navegador")){
            System.out.println("escolha a funcionalidade do aplicativo 'navegador'");
            escolhaUsuario= scan.nextLine();
            if (escolhaUsuario.equals("exibir pagina")) {
                iphone.exibirPagina();
            }
            else if(escolhaUsuario.equals("adicionar nova aba")){
                iphone.adicionarNovaAba();
            }
            else if(escolhaUsuario.equals("atualizar pagina")){
                iphone.atualizarPagina();
            }
        }
        else if(escolhaUsuario.equals("musica")){
            System.out.println("escolha a funcionalidade do aplicativo 'reprodutor musical'");
            escolhaUsuario= scan.nextLine();
             if (escolhaUsuario.equals("tocar")) {
                iphone.tocar();
            }
            else if(escolhaUsuario.equals("pausar")){
                iphone.pausar();
            }
            else if(escolhaUsuario.equals("selecionar musica")){
                iphone.selecionarMusica();
            }
        }

    }
}
