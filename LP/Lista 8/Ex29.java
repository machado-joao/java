public class Ex29 {
    
    public static void main(String[] args) {
        int n = 10;
        int[] aj = new int[n];
        aj = Vetor.preencherVetor(aj, 9);
        int vidas = n / 2, vida = n / 2;
        boolean acertou = false;
        while(!acertou && vidas >= 0) {
            System.out.printf("Tente acertar um número do vetor [%d/%d]: ", vidas, vida);
            int palpite = Vetor.scanner.nextInt();
            for(int i = 0; i < aj.length; i++) {
                if(palpite == aj[i]) {
                    System.out.println("Você acertou!");
                    System.out.print("Vetor: ");
                    Vetor.imprimirVetor(aj);
                    acertou = true;
                    break;
                }
            }
            vidas--;
        }
    }

}
