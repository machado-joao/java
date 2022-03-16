import java.util.Scanner;

public class Vetor {
    public static Scanner scanner = new Scanner(System.in);
    public static Scanner scannerStr = new Scanner(System.in);

    public static int[] lerVetor(int tamanho) {
        int[] vetor = new int[tamanho];
        for(int i = 0; i < vetor.length; i++) {
            System.out.printf("[%d] = ", i);
            vetor[i] = scanner.nextInt();
        }
        return vetor;
    }

    public static void imprimirVetor(int[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirVetorInvertido(int[] vetor) {
        for(int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirVetor(double[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void imprimirVetor(String[] vetor) {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static int[] somarVetores(int[] vetor1, int[] vetor2) {
        int[] vetor3 = new int[vetor1.length];
        for(int i = 0; i < vetor3.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        return vetor3;
    }

    public static String encontrarMaiorMenor(int[] vetor) {
        int maior = 0, menor = 0, posicao_maior = 0, posicao_menor = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(i == 0) {
                maior = vetor[i];
                menor = vetor[i];
                posicao_maior = i;
                posicao_menor = i;
            }
            if(vetor[i] > maior) {
                maior = vetor[i];
                posicao_maior = i;
            }
            if(vetor[i] < menor) {
                menor = vetor[i];
                posicao_menor = i;
            }
        }
        return String.format("Maior elemento = %d na posição %d\n" + 
                             "Menor elemento = %d na posição %d\n",
                             maior, posicao_maior, menor, posicao_menor);
    }

    public static int[] concatenarVetores(int[] vetor1, int[] vetor2) {
        int tamanho = vetor1.length + vetor2.length;
        int[] vetor3 = new int[tamanho];
        int auxiliar = 0;
        for(int i = 0; i < vetor1.length; i++) {
            vetor3[auxiliar++] = vetor1[i];
        }
        for(int i = 0; i < vetor2.length; i++) {
            vetor3[auxiliar++] = vetor2[i];
        }
        return vetor3;
    }

    public static int[] intercalarVetores(int[] vetor1, int[] vetor2) {
        int[] vetor3 = new int[vetor1.length + vetor2.length];
        int i = 0, j = 0, k = 0;
        while(i < vetor1.length && j < vetor2.length) {
            vetor3[k++] = vetor1[i++];
            vetor3[k++] = vetor2[j++];
        }
        while(i < vetor1.length) {
            vetor3[k++] = vetor1[i++];
        }
        while(j < vetor2.length) {
            vetor3[k++] = vetor2[j++];
        }
        return vetor3;
    }

    public static int[] ordenarCrescentemente(int[] vetor) {
        int auxiliar;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static int[] ordenarDecrescentemente(int[] vetor) {
        int auxiliar;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] < vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static double[] ordenarCrescentemente(double[] vetor) {
        double auxiliar;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static int contarImpares(int[] vetor) {
        int contador = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPares(int[] vetor) {
        int contador = 0;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static int[] preencherVetor(int[] vetor, int valorMaximo) {
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * valorMaximo + 1);
        }
        return vetor;
    }
}
