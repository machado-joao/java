import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        double valorTotalConta = 0.0;
        do {
            System.out.print("Valor da conta: R$ ");
            valorTotalConta = sc.nextDouble();
            if(valorTotalConta < 0 || valorTotalConta > 1000) {
                System.out.println("Por favor, digite um valor válido!");
            }
        } while(valorTotalConta < 0 || valorTotalConta > 1000);

        int quantidadePessoas = 0;
        do {
            System.out.print("Quantidade de pessoas: ");
            quantidadePessoas = sc.nextInt();
            if(quantidadePessoas <= 0) {
                System.out.println("Por favor, digite um valor válido!");
            }
        } while(quantidadePessoas <= 0);

        int resposta = 0;
        do {
            System.out.print("Pagar 10% para o garçom?\n1. Não\n2. Sim\n");
            resposta = sc.nextInt();
            if(resposta < 1 || resposta > 2) {
                System.out.println("Por favor, digite um valor válido!");
            }
        } while(resposta < 1 || resposta > 2);
        sc.close();

        char respostaChar = ' ';
        if(resposta == 1) {
            respostaChar = 'N';
        } else {
            respostaChar = 'S';
        }

        double valorContaDividida = 0.0;
        switch(respostaChar) {
            case 'N':
                valorContaDividida = conta.valorSemGorjeta(valorTotalConta, quantidadePessoas);
                break;
            case 'S':
                valorContaDividida = conta.valorComGorjeta(valorTotalConta, quantidadePessoas);
                break;
        }
        System.out.printf("Cada um dos %d amigos pagará R$ %.2f\n", quantidadePessoas, valorContaDividida);
    }
    
}
