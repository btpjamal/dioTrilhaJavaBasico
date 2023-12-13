import java.util.Scanner;
public class repeticaoFor {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("digite a quantidade");
    int quantidade= scan.nextInt();
    System.out.println("-=-=-=-=-=-=-=-=-=-");
    for (int i = 1; i <= quantidade; i++){
        System.out.println(i);
    }   
    System.out.println("fim da contagem");
    }
}
