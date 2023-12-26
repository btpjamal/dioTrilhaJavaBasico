package testePOO;
public class autodromo {

    public static void main(String[] args) {
        carro carro = new carro();
        carro.setChassi("12345");
        //carro.ligar();
        moto moto = new moto();
        moto.setChassi("67890");
        //moto.ligar();
        veiculo siena = new carro();
        veiculo tornado = new moto();
        siena.ligar();
        tornado.ligar();
    }
}