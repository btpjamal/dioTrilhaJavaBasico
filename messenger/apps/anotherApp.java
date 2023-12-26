package messenger.apps;

public class anotherApp extends servicoMensagem {
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo anotherApp");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo anotherApp");
        salvarHistoricoMensagem();
    }
}
