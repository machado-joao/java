import java.util.Scanner;
import java.util.Random;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma opção:\n" +
                         "1. Gerar hora manualmente.\n" +
                         "2. Gerar hora automaticamente.\n" +
                         "Escolha: ");
        int escolha = sc.nextInt();

        int hora = 0;
        switch(escolha) {
            case 1:
                do {
                    System.out.print("Digite a hora desejada: ");
                    hora = sc.nextInt();
                    if(hora < 0 || hora > 23) {
                        System.out.println("Digite uma hora válida!");
                    }
                } while(hora < 0 || hora > 23);
                sc.close();
                break;
            case 2:
                System.out.println("Gerando a hora de forma automática...");
                Random geradorHora = new Random();
                hora = geradorHora.nextInt(24);
                break;
            default:
                System.out.println("Valor inválido!");
        }

        if(escolha == 1 || escolha == 2) {
            System.out.println("São " + hora + "h");
            if(hora >= 0 && hora <= 6) {
                System.out.println("Boa madrugada!");
            } else if(hora >= 7 && hora <= 11) {
                System.out.println("Bom dia!");
            } else if(hora >= 12 && hora <= 17) {
                System.out.println("Boa tarde!");
            } else {
                System.out.println("Boa noite!");
            }
        }
    }

}
