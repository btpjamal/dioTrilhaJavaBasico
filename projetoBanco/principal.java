package projetoBanco;

import projetoBanco.contas.Contas;
import projetoBanco.contas.contaCorrente;
import projetoBanco.contas.contaPoupanca;
import projetoBanco.cliente;
import java.util.Scanner;





public class principal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Deseja criar uma conta no banco?");
        String novaconta= scan.nextLine();
        if(novaconta.equals("nao")){
            System.out.println("Fim do programa");
        }else if(novaconta.equals("sim")){
            cliente cliente = new cliente();
            System.out.println("Informe o nome do cliente");
            cliente.setNome(scan.nextLine());
            System.out.println("Informe a idade");
            cliente.setIdade(scan.nextInt());
            scan.nextLine();

            System.out.println("Informe o CPF");
            cliente.setCpf(scan.nextInt());
            scan.nextLine();
            System.out.println(cliente.nome + " tecle [0] para criar uma conta corrente, [1] para criar uma conta poupança, [2] para criar ambas as contas");
            int escolhaconta= scan.nextInt();
            scan.nextLine();
            if(escolhaconta == 0){
                contaCorrente cc= new contaCorrente(cliente);
                System.out.println("Deseja fazer um deposito para a conta corrente?");
                String depositocc= scan.nextLine();
                if(depositocc.equals("não")){
                    System.out.println("Conta criada, sem saldo no momento");
                }else if(depositocc.equals("sim")){
                    System.out.println("Informe o valor a depositar na conta corrente");
                    cc.depositar(scan.nextDouble());
                    scan.nextLine();
                    cc.getSaldo();
                    System.out.println("Digite [extrato], para ver o extrato da conta");
                    String extrato= scan.nextLine();
                    if(extrato.equals("extrato")){
                        cc.imprimirExtrato();
                    }
                }
            }else if(escolhaconta == 1){
                contaPoupanca poupanca = new contaPoupanca(cliente);
                System.out.println("Deseja fazer um deposito para a conta poupança?");
                String depositopoupanca= scan.nextLine();
                if(depositopoupanca.equals("não")){
                    System.out.println("Conta criada, sem saldo no momento");
                }else if(depositopoupanca.equals("sim")){
                    System.out.println("Informe o valor a depositar na conta poupança");
                    poupanca.depositar(scan.nextDouble());
                    scan.nextLine();
                    poupanca.getSaldo();
                    System.out.println("Digite [extrato], para ver o extrato da conta");
                    String extrato= scan.nextLine();
                    if(extrato.equals("extrato")){
                        poupanca.imprimirExtrato();
                    }
                }
            }else if(escolhaconta == 2){
                contaCorrente contascc= new contaCorrente(cliente);
                contaPoupanca contaspoupanca = new contaPoupanca(cliente);
                System.out.println("Deseja fazer um deposito para alguma das contas?");
                String depositocontas= scan.nextLine();
                if(depositocontas.equals("nao")){
                    System.out.println("Contas criadas, sem saldo no momento");
                }if(depositocontas.equals("sim")){
                    System.out.println("Selecione a conta a ser feita o depósito");
                    System.out.println("[1]- conta corrente, [2]- conta poupança ");
                    int selecaoconta= scan.nextInt();
                    scan.nextLine();
                    if(selecaoconta == 1){
                        System.out.println("Informe a quantia a ser depositada em sua conta corrente");
                        contascc.depositar(scan.nextDouble());
                        scan.nextLine();
                    }if(selecaoconta == 2){
                        System.out.println("Informe a quantia a ser depositada em sua conta poupança");
                        contaspoupanca.depositar(scan.nextDouble());
                        scan.nextLine();
                    }
                    System.out.println("Digite [extrato], para ver o extrato de suas contas");
                    String extratocontas= scan.nextLine();
                    if(extratocontas.equals("extrato")){
                        contascc.imprimirExtrato();
                        contaspoupanca.imprimirExtrato();
                    }
                }
                

            }



        }

    }
}
