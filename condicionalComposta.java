import java.util.Scanner;
public class condicionalComposta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe a quantidade de notas");
        int quantidade = scan.nextInt(); 
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        int soma = 0;
        for (int i = 1; i <= quantidade; i++){
            System.out.println("Nota "+ i);
            int nota = scan.nextInt();
            soma += nota;
        }
        int media = soma / quantidade;
        System.out.println("A média é: "+ media);

        if (media < 6){
            System.out.println("REPROVADO");
        }
        else{
            System.out.println("APROVADO");
        }
    }
}
