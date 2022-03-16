import java.util.Scanner;

public class Ex52 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um termo da sequência: ");
        int termo = sc.nextInt();
        sc.close();
        int anterior = 0, proximo = 1, fibonacci;
        boolean encontrou = false;
        while(!encontrou && anterior <= termo) {
            System.out.print(anterior + " ");
            if(anterior == termo) {
                encontrou = true;
                break;
            }
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println("\nO termo " + termo + " foi encontrado na sequência de Fibonacci? " + (encontrou ? "Sim" : "Não"));
    }

}
