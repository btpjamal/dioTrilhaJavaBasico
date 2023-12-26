package escola;
import escola.aluno;
public class escola {
    public static void main(String[] args) {
    aluno jamal = new aluno();
    jamal.setNome("Jamal");
    jamal.setIdade(23);

    System.out.println("O aluno "+ jamal.getNome() +" tem "+ jamal.getIdade() +" anos");
    }
}
