import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite um nome completo: ");
        String nomeCompleto = scStr.nextLine();
        scStr.close();
        String[] nomes = nomeCompleto.split(" ");
        System.out.println("Sobrenome: " + nomes[nomes.length - 1]);
    }

}
