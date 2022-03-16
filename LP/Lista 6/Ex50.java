import java.util.Scanner;

public class Ex50 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o termo inicial: ");
        int termoInicial = sc.nextInt();
        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int numero, divisores, contadorTermos = 0, contadorTermosAposPassagem = 0;
        StringBuilder sequencia = new StringBuilder();
        for(int i = 1; contadorTermosAposPassagem != quantidadeTermos; i++) {
            numero = i;
            divisores = 0;
            for(int j = 1; j <= numero; j++) {
                if(numero % j == 0) {
                    divisores++;
                }
            }
            if(divisores == 2) {
                contadorTermos++;
                if(contadorTermos >= termoInicial) {
                    sequencia.append(numero + " ");
                    contadorTermosAposPassagem++;
                }
            }
        }
        System.out.println("Sequência: " + sequencia);    
    }

}
