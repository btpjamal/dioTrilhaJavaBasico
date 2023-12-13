import java.util.ArrayList;
import java.util.Scanner;
public class repeticaoWhile {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList alunos = new ArrayList<String>();
    String respostaUsuario = "";
    while (!respostaUsuario.equals("n")) {
        System.out.println("informe o nome do aluno");
        String aluno= scan.nextLine();
        alunos.add(aluno);
        System.out.println("deseja adicionar mais um aluno?");
        respostaUsuario= scan.nextLine();
    }
    
    System.out.println(alunos);

}
}