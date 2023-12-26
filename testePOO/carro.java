package testePOO;


public class carro extends veiculo{
    public void ligar(){
        conferirCombustivel();
        calibrarPneus();
        System.out.println("Carro ligado");
    }
}
