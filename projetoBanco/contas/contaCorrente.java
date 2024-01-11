package projetoBanco.contas;
public class contaCorrente extends Contas{
    
    
    public contaCorrente(projetoBanco.cliente cliente) {
        conta(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        extrato(cliente);
    }

    @Override
    public void conta(projetoBanco.cliente cliente) {
        // TODO Auto-generated method stub
        super.conta(cliente);
    }

}