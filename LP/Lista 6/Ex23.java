import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double acumuladoraSalario = 0, maiorSalario = 0;
        int quantidadeHabitantes = 0, acumuladoraFilhos = 0, salarioMenorQue150 = 0;
        while(true) {
            System.out.print("Digite o salário: ");
            double salario = sc.nextDouble();
            if(salario < 0) {
                break;
            }
            if(salario < 150) {
                salarioMenorQue150++;
            }
            acumuladoraSalario += salario;
            System.out.print("Digite o número de filhos: ");
            int numeroFilhos = sc.nextInt();
            acumuladoraFilhos += numeroFilhos;
            quantidadeHabitantes++;
            if(quantidadeHabitantes == 1) {
                maiorSalario = salario;
            }
            if(salario > maiorSalario) {
                maiorSalario = salario;
            }
        }
        sc.close();
        double mediaSalarial = acumuladoraSalario / quantidadeHabitantes;
        System.out.printf("Média salarial da população: R$ %.2f\n", mediaSalarial);
        double mediaFilhos = (double) acumuladoraFilhos / quantidadeHabitantes;
        System.out.printf("Média de filhos da população: %.2f\n", mediaFilhos);
        System.out.printf("Maior salário entre a população: R$ %.2f\n", maiorSalario);
        double percentualSalarioInferior150 = ((double) salarioMenorQue150) / quantidadeHabitantes * 100;
        System.out.printf("Percentual da população com salário inferior a R$ 150,00: %.2f%%\n", percentualSalarioInferior150);
    }

}
