public class Ex08_v2 {

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int contadorPares = 0, contadorImpares = 0;
        for(int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
               if(matriz[i][j] % 2 == 0) {
                   contadorPares++;
               } else {
                   contadorImpares++;
               }
           } 
        }

        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];

        int auxiliarPar = 0, auxiliarImpar = 0;
        for(int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0) {
                    pares[auxiliarPar++] = matriz[i][j];
                } else {
                    impares[auxiliarImpar++] = matriz[i][j];
                }
           } 
        }

        auxiliarPar = 0;
        auxiliarImpar = 0;
        System.out.println("Vetor de pares:");
        for(int i = 0; i < pares.length; i++) {
            System.out.print(pares[auxiliarPar] + " ");
            auxiliarPar++;
        }
        System.out.println();
        System.out.println("Vetor de ímpares:");
        for(int i = 0; i < impares.length; i++) {
           System.out.print(impares[auxiliarImpar++] + " "); 
        }
        System.out.println();
    }

}
