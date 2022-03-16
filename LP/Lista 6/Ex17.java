import java.util.Scanner;

public class Ex17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        char resposta;
        do {
            double nota1 = 0, nota2 = 0;
            do {
                System.out.print("Digite a nota 1: ");
                nota1 = sc.nextDouble();
                if(nota1 < 0 || nota1 > 10) {
                    System.out.println("Digite uma nota entre zero e dez!");
                }
            } while(nota1 < 0 || nota1 > 10);
            do {
                System.out.print("Digite a nota 2: ");
                nota2 = sc.nextDouble();
                if(nota2 < 0 || nota2 > 10) {
                    System.out.println("Digite uma nota entre zero e dez!");
                }
            } while(nota2 < 0 || nota2 > 10);
            double media = (nota1 + nota2) / 2;
            System.out.printf("A média do aluno foi %.1f\n", media);
            System.out.print("Deseja calcular outra média? ");
            resposta = scStr.nextLine().toLowerCase().charAt(0);
        } while(resposta == 's');
        sc.close();
        scStr.close();
    }

}
