import java.util.Scanner;
public class condicionalEncadeada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anoAtual= 2023;
        System.out.println("Em que ano você nasceu?");
        int anoNascimento= scan.nextInt();
        int idadeAtual= anoAtual - anoNascimento;
        System.out.println("você tem "+ idadeAtual +" anos");

        if (idadeAtual < 18){
            System.out.println("você é menor de idade");
        }
        else if (idadeAtual >= 18 && idadeAtual <= 23){
            System.out.println("você é um adulto-jovem");
        }
        else{
            System.out.println("você já é um adulto formado");
        }
    }
}
