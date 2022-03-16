public class Ex30 {
    
    public static void main(String[] args) {
        double[] notas = new double[5];
        for(int i = 0; i < notas.length; i++) {
            double nota;
            do {
                System.out.printf("Nota %d: ", i);
                nota = Vetor.scanner.nextDouble();
                if(nota < 0 || nota > 10) {
                    System.out.println("Digite notas entre 0 e 10!");
                }
            } while(nota < 0 || nota > 10);
            notas[i] = nota;
        }
        System.out.print("Vetor de notas: ");
        Vetor.imprimirVetor(notas);
        notas = Vetor.ordenarCrescentemente(notas);
        System.out.print("Vetor de notas ordenado: ");
        Vetor.imprimirVetor(notas);
        double somaNotas = 0;
        for(int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }
        double media = somaNotas / notas.length;
        System.out.printf("Média das notas: %.2f\n", media);
    }

}
