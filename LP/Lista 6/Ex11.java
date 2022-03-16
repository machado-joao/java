import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos na sala: ");
        int quantidadeAlunos = sc.nextInt();
        double notas = 0;
        for(int i = 1; i <= quantidadeAlunos; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i);
            notas += sc.nextDouble();
        }
        sc.close();
        double media = notas / quantidadeAlunos;
        System.out.printf("A média de notas da sala foi %.2f\n", media);
    }

}
