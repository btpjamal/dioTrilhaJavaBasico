public class tiposVariaveis {

    public static void main(String[] args) {
        String nome = "jamal";
        byte idade = 23;
        //short ano = 2023;
        //int populacao = 214892182;
        //long distancia = 9223372036854775807L;
        //float pi = 3.14f;
        //double numero_quebrado= 2.718281828459045;
        //char letra = 'a';
        //boolean estudo= true;
        //int[] numeros = {1,2,3,4,5};
        Pessoa pessoa = new Pessoa("jamal", 23);
        System.out.println(pessoa);

    }
}
class Pessoa {
  String nome;
  int idade;

  // construtor da classe
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // sobrescrever o método toSring()
  @Override
  public String toString() {
    return "Nome: " + nome + ", Idade: " + idade;
  }
}

