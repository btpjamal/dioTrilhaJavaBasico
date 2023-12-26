package testePOO;

public class moto extends veiculo {
    public void ligar(){
        conferirCombustivel();
        calibrarPneus();
        System.out.println("Moto ligada");
    }
}
