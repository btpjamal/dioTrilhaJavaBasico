import java.util.Scanner;
public class condicaoTernaria {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe a nota");
    int nota = scan.nextInt();
    String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";
      //nota é >= a 7? se sim "Aprovado" senão se nota >=5 e nota <7 "Recuperação", senão, "Reprovado"
    System.out.println(resultado);
    }
}
