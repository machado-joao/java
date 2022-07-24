import java.util.Scanner;

public class Ex54 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o termo inicial da sequência: ");
        int termoInicial = sc.nextInt();
        System.out.print("Digite o termo final da sequência: ");
        int termoFinal = sc.nextInt();
        sc.close();
        int contadorPassagem = 0, anterior = 0, proximo = 1, fibonacci;
        for (int i = 1; i <= termoFinal; i++) {
            contadorPassagem++;
            if (contadorPassagem >= termoInicial) {
                System.out.print(anterior + " ");
            }
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println();
    }

}
