import java.util.Random;

public class Ex08 {
    
    public static void main(String[] args) {
        int quantidadeJogadas = 10000;
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;
        for(int i = 1; i <= quantidadeJogadas; i++) {
            int valor = dado();
            if(valor == 1) {
                n1++;
            } else if(valor == 2) {
                n2++;
            } else if(valor == 3) {
                n3++;
            } else if(valor == 4) {
                n4++;
            } else if(valor == 5) {
                n5++;
            } else {
                n6++;
            }
        }
        System.out.printf("1: %.2f%%\n", (double) n1 / quantidadeJogadas * 100);
        System.out.printf("2: %.2f%%\n", (double) n2 / quantidadeJogadas * 100);
        System.out.printf("3: %.2f%%\n", (double) n3 / quantidadeJogadas * 100);
        System.out.printf("4: %.2f%%\n", (double) n4 / quantidadeJogadas * 100);
        System.out.printf("5: %.2f%%\n", (double) n5 / quantidadeJogadas * 100);
        System.out.printf("6: %.2f%%\n", (double) n6 / quantidadeJogadas * 100);
    }

    private static int dado() {
        Random dado = new Random();
        return (dado.nextInt(6) + 1);
    }

}
