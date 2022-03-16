import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = sc.nextDouble();
        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = sc.nextDouble();
        sc.close();
        double salarioAdicional = 0, valorAcima1500 = 0;
        if(valorVendas > 1500) {
            valorAcima1500 = valorVendas - 1500;
            valorVendas -= valorAcima1500;
            salarioAdicional += valorAcima1500 * 0.05;
        }
        System.out.println("sal vendas: " + valorVendas);
        salarioAdicional += valorVendas * 0.03;
        double salarioBruto = salarioFixo + salarioAdicional;
        System.out.printf("Salário bruto do vendedor: R$ %.2f\n", salarioBruto);
    }

}
