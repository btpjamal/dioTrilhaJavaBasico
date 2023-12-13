import java.util.Scanner;
import java.util.ArrayList;
public class repeticaoForComArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList lista = new ArrayList<String>();

        int i = 0;
        System.out.println("digite a quantidade");
        int quantidade = scan.nextInt();
        scan.nextLine();
        for (i = 0; i <= quantidade -1; i++){
            System.out.println("digite um nome");
            String nomes = scan.nextLine();
            lista.add(nomes);
            System.out.println("o aluno no índice "+ i + " é "+ lista.get(i));
        }
        System.out.println(lista);
    }
}
