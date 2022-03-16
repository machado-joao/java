import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o valor pago por hora trabalhada: ");
        double valorHora = sc.nextDouble();
        sc.close();
        int horasExtras = (horasTrabalhadas - 120);
        double salarioRegular = (horasTrabalhadas - horasExtras) * valorHora;
        double salarioAdicional = horasExtras * (valorHora + valorHora * 0.5);
        double salarioBruto = salarioRegular + salarioAdicional;
        System.out.printf("Salário bruto do funcionário: R$ %.2f\n", salarioBruto);
    }

}
