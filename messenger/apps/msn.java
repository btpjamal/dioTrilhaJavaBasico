package messenger.apps;

public class msn extends servicoMensagem {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo msn");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo msn");
        salvarHistoricoMensagem();
    }
}
