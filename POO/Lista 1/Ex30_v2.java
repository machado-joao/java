import java.util.Scanner;

public class Ex30_v2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int tamanhoVetor = 0;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            tamanhoVetor = leia.nextInt();
            if(tamanhoVetor < 1) {
                System.out.println("Valor inválido!");
            }
        } while(tamanhoVetor < 1);
        leia.close();

        int[] vetor = new int[tamanhoVetor];

        int maior = 0;
        for(int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = (int) (Math.random() * 10);
            if(i == 0) {
                maior = vetor[i];
            }
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        int[][] matriz = new int[tamanhoVetor][maior + 1];

        for(int i = 0; i < tamanhoVetor; i++) { 
            matriz[i][0] = vetor[i];
        }

        for(int i = 0; i < matriz.length; i++) {
            int primeiro = 0, segundo = 1, fibonacci = 0;
            for(int j = 1; j < matriz[i].length; j++) {
                matriz[i][j] = primeiro;
                fibonacci = primeiro + segundo;
                primeiro = segundo;
                segundo = fibonacci;
            }
        }

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(j <= vetor[i]) {
                    if(j < vetor[i]) {
                        System.out.print(matriz[i][j] + " ");
                    } else {
                        System.out.print(matriz[i][j]);
                    }
                } 
            }
            System.out.println();
        }
    }

}
