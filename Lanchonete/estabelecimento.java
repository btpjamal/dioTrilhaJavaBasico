import atendimento.atendente;
import areaCliente.cliente;

public class estabelecimento {
    public static void main(String[] args) {
        cozinheiro cozinheiro = new cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
        //cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitamina();
        //cozinheiro.selecionarIngredientesVitamina();
        //cozinheiro.prepararLanche();
        //cozinheiro.prepararVitamina();
        
        //ações que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        almoxarife almoxarife = new almoxarife();
        // ações que não precisam estar disponíveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        // ação que somente a classe cozinha precisa conhecer
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        atendente atendende = new atendente();
        //atendende.pegarLancheCozinha();
        atendende.receberPagamento();
        atendende.servindoMesa();
    

        cliente cliente = new cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // essa ação é sigilosa, pode ser privada
        //cliente.consultarSaldoAplicativo();

        
    }
}
