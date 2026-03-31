package T05;
import java.util.Scanner;

public class EX02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        System.out.print("Digite um número: ");
        numero = sc.nextDouble();
        //Estrutura de Decisão
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        }
        else if (numero == 0){
            System.out.println(numero + " é zero");
        }
        
        else{
        System.out.println(numero + "é negativo");
        }
        
            
         
        sc.close();

}
    }

