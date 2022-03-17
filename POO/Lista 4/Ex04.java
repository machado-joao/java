import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double notas[] = new double[3];
        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Digite a nota %d: ", (i + 1));
            notas[i] = sc.nextDouble();
            if(notas[i] < 0.0 || notas[i] > 10.0) {
                notas[i] = 0.0;
            }
        }
        sc.close();

        String resposta = calcularNotas(notas);
        System.out.println(resposta);
    }

    private static String calcularNotas(double notas[]) {
        double mediaMaiores = 0, media = 0, maiorNota = 0, menorNota = 0;
        int posicaoMenorNota = 0;
        for(int i = 0; i < notas.length; i++) {
            if(i == 0) {
                maiorNota = notas[i];
                menorNota = notas[i];
            }
            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
            if(notas[i] < menorNota) {
                menorNota = notas[i];
                posicaoMenorNota = i;
            }
            media += notas[i];
            mediaMaiores += notas[i];
            if(i == notas.length - 1) {
                mediaMaiores -= notas[posicaoMenorNota];
            }
        }
        return String.format("Média maiores: %.1f\nMédia aritmética: %.1f\nMaior nota: %.1f\nMenor nota: %.1f", mediaMaiores / 2, media / 3, maiorNota, menorNota);
    }

}
