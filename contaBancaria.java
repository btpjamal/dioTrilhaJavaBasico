import java.util.Scanner;
public class contaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número da conta");
        int numero= scanner.nextInt();

        System.out.println("Informe o número da agência");
        int agencia= scanner.nextInt();

        System.out.println("Informe o nome do cliente");
        String nomeCliente= scanner.next();

        System.out.println("Informe o saldo da conta");
        double saldo= scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", Obrigado por criar uma conta em nosso banco, sua agência é: " + agencia);
        System.out.println("sua conta é: " + numero + " e seu saldo é: " + saldo); 
    }
}
