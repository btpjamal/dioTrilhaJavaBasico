package atendimento;
public class atendente {
    public void servindoMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
    }
    private void pegarLancheCozinha(){
        System.out.println("PEGANDO O LANCHE DA COZINHA");
    }
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }
    void trocarGas(){
        System.out.println("ATENDENTE TROCANDO O GÁS");
    }
    private void pegarPedidoBalcao(){
        System.out.println("PEGANDO O PEDIDO DO BALCÃO");
    }
}
