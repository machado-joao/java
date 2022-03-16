import java.util.Scanner;

public class Ex04 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        sc.close();
        double media = (nota1 + nota2) / 2;
        System.out.println("A média foi de " + media);
        if(media >= 6) {
            System.out.println("O aluno foi aprovado!");
        } else {
            System.out.println("O aluno foi reprovado!");
        }
    }

}
