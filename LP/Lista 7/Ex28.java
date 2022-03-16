import java.util.Scanner;

public class Ex28 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);    

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        int inicio = 0, fim = frase.length() - 1;
        String fraseDobrada = "";
        while(inicio < fim) {
            fraseDobrada += frase.charAt(inicio);
            inicio++;
            if(inicio <= fim) {
                fraseDobrada += frase.charAt(fim);
                fim--;
            }
        }
        System.out.println("Frase dobrada: " + fraseDobrada);
    }

}
