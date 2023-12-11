public class operadores {
    public static void main(String[] args) {
        String nomeCompleto= "linguagem " + "Java"; // concatenação de Strings
        System.out.println(nomeCompleto);

        String concatenacao= "?";
        concatenacao = 1+1+1+"1"; // 3 + "1"= 31
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1; // 1+ "1" + 1 + 1, após o caractere, ele para de fazer as operações matemáticas
        System.out.println(concatenacao);
        concatenacao= 1+"1"+1+"1"; // após a primeira ocorrência de caractere, ele passa a concatenar o resto
        System.out.println(concatenacao);
        concatenacao= "1"+1+1+1; // o mesmo ocorre aqui tbm
        System.out.println(concatenacao);
        concatenacao= "1"+(1+1+1); // 13, primeiro ele realiza a soma entre parenteses, depois concatena com o "1" que vem antes
        System.out.println(concatenacao);

        int numero = 5;
        numero = - numero; // para deixar o número negativo
        System.out.println(numero);
        numero= numero*-1; // para deixar um número negativo, positivo
        System.out.println(numero);

        boolean variavel= true;
        variavel = !variavel; // imprime o valor false

        int a, b;
        a=6;
        b=5;

        String resultado= a ==b ? "Verdadeiro" : "Falso"; // operador ternário

        int numero1= 1;
        int numero2= 2;

        boolean simNao= numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);
        boolean diferente= numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + diferente);
        boolean maior= numero1 > numero2;
        boolean menor= numero1 < numero2;

        // no geral todos os operadores respodem igual no python

        String nomeUm= "Jamal";
        String nomeDois = new String("Jamal");
        System.out.println(nomeUm == nomeDois); // assim imprime falso, pois compara os objetos
        System.out.println(nomeUm.equals(nomeDois)); // assim imprime verdadeiro, pois compara o conteúdo


    }
}
