package messenger;
import java.util.Scanner;

import messenger.apps.anotherApp;
import messenger.apps.msn;
import messenger.apps.servicoMensagem;
import messenger.apps.telegram;
public class usuarioJamal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        servicoMensagem sm = null;
        System.out.println("Escolha o app de mensagem");
        String appchose= scan.nextLine();

        if(appchose.equals("anotherapp")){
            sm = new anotherApp();
        }
        else if(appchose.equals("telegram")){
            sm= new telegram();
        }
        else if(appchose.equals("msn")){
            sm= new msn();
        }
        sm.enviarMensagem();
        sm.receberMensagem();
    }
}
