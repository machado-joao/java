import java.util.Scanner;

public class Ex60 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo da sequência: ");
        int anterior = sc.nextInt();
        System.out.print("Digite o segundo termo da sequência: ");
        int proximo = sc.nextInt();
        System.out.print("Digite um termo qualquer: ");
        int termo = sc.nextInt();
        sc.close();
        int ricci;
        boolean encontrou = false;
        while(!encontrou && anterior <= termo) {
            System.out.print(anterior + " ");
            if(anterior == termo) {
                encontrou = true;
                break;
            }
            ricci = anterior + proximo;
            anterior = proximo;
            proximo = ricci;
        }
        System.out.println("\nO termo " + termo + " foi encontrado na sequência de Ricci? " + (encontrou ? "Sim" : "Não"));
    }

}
