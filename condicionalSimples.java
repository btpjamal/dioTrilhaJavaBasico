import java.util.Scanner;
public class condicionalSimples{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o saldo");
        int saldo= scan.nextInt();
        System.out.println("Informe a quantia do saque");
        int saque= scan.nextInt();


        if (saque < saldo)
        saldo= saldo - saque;
        System.out.println("Seu novo saldo é: "+ saldo);
    }
}