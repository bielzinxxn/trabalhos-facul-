import java.util.Scanner;

public class EX04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor;
        System.out.print("Digite o valor do produto: R$");
        valor = sc.nextDouble();
        if (valor <= 50) {
            System.out.println("R$" + valor + " este produto tem um valor barato.");
        }
        else if (valor >= 51 && valor <= 100) {
        System.out.println("R$" + valor + " este produto tem um valor médio.");
        }
        
        else{
        System.out.println("R$" + valor + " este produto é caro.");
        }
        
            
         
        sc.close();

}
    }