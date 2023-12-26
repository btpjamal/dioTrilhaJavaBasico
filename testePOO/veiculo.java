package testePOO;

public abstract class veiculo {
    public abstract void ligar();

    public void conferirCombustivel(){
        System.out.println("Combustivel conferido!");
    }
    public void calibrarPneus(){
        System.out.println("Pneus calibrados!");
    }
    private String chassi;
    public String getChassi(){
        return chassi;
    }
    public void setChassi(String chassi){
        this.chassi= chassi;
    }

}
