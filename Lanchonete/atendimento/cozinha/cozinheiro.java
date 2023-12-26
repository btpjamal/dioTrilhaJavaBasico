public class cozinheiro{
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NO BALCÃO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE");
    }
    private void prepararVitamina(){
        System.out.println("PREPARANDO VITAMINA");
    }
    private void prepararComboVitamina(){
        prepararLanche();
        prepararVitamina();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO: PÃO, SALADA, OVO E CARNE");
    }
    private void selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO: FRUTA, LEITE E SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitamina(){
        System.out.println("BATENDO VITAMINA");
    }
    private void fritarIngredientesLanche(){
        System.out.println("FRITANDO CARNE E OVO PARA HAMBURGUER");
    }
    private void pedirIngredientes(almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }

}