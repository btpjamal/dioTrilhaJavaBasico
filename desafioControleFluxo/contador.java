package desafioControleFluxo;
import java.util.Scanner;
public class contador{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int numero1= scan.nextInt();
        System.out.println("Digite o segundo número");
        int numero2= scan.nextInt();
        try{
            if(numero1 > numero2){
                throw new parametrosInvalidos("O segundo número deve ser maior que o primeiro");
            }
            for(; numero1 < numero2; numero1++){
                System.out.println(numero1);
            }
        }catch(parametrosInvalidos Ex){
            System.out.println(Ex.getMessage());
        }        
    }
}



