import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase1 = scStr.nextLine();
        System.out.print("Digite outra frase: ");
        String frase2 = scStr.nextLine();
        scStr.close();
        boolean iguais = true;
        for(int i = 0; i < frase1.length(); i++)  {
            if(frase1.charAt(i) != frase2.charAt(i)) {
                iguais = false;
                break;
            }
        }
        System.out.println("As duas frases são iguais? " + (iguais ? "Sim" : "Não"));
    }

}
