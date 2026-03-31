import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n-> VOGAL OU CONSOANTE <-\n");
        System.out.print("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("A letra: '" + letra + "' é vogal");
            break;
            default:
                System.out.println("A letra: '" + letra + "' é consoante");
            break;
        }
    }
}
