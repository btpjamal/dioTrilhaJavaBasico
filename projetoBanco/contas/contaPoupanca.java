package projetoBanco.contas;
public class contaPoupanca extends Contas{
    public contaPoupanca(projetoBanco.cliente cliente) {
        conta(cliente);
    }

    @Override
    public void conta(projetoBanco.cliente cliente) {
        // TODO Auto-generated method stub
        super.conta(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        extrato(cliente);
    }
    
}