package messenger.apps;

public abstract class servicoMensagem {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConexaoInternet(){
        System.out.println("Validando conexão internet");
    }
    protected void salvarHistoricoMensagem(){
        System.out.println("Fazendo Backup de mensagens");
    }
}
