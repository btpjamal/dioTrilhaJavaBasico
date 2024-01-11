package projetoBanco.contas;

import projetoBanco.cliente;

public abstract class Contas{
    private static int contadorContas= 1;
    protected final int agencia_padrao= 1;              
    protected int agencia;                       // atributos principais
    protected int numeroConta;                   // atributos principais
    protected double saldo;                      // atributos principais
    protected cliente cliente;

    public void conta(cliente cliente){
        agencia= agencia_padrao;         
        numeroConta= contadorContas++;
        this.cliente = cliente;
    }
    public void sacar(double valor){
        saldo = saldo - valor;
    }
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    public void transferir(double valor, Contas contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
        
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void extrato(cliente cliente){
        System.out.println("Titular: "+ cliente.getNome());
        System.out.println("Agência: "+ agencia);
        System.out.println("Nº Conta: "+ numeroConta);
        System.out.println("Saldo :"+ saldo);
    }
    public void imprimirExtrato() {
    }
   
}