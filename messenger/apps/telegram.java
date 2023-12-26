package messenger.apps;

public class telegram extends servicoMensagem{
    public void enviarMensagem(){
        validarConexaoInternet();
        System.out.println("Enviando mensagem pelo telegram");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        validarConexaoInternet();
        System.out.println("Recebendo mensagem pelo telegram");
        salvarHistoricoMensagem();
    }

}