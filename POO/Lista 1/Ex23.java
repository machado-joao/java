import java.util.Scanner;

public class Ex23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int coluna = sc.nextInt();
        sc.close();

        int matriz[][] = new int[linha][coluna];
        int numero = 0, contador = 0, posicao = 0;
		int primos[] = new int[linha * coluna];
		while(primos[primos.length - 1] == 0){
			numero++;
			contador = 0;
			for(int verificador = 1; verificador <= numero; verificador++){
				if(numero % verificador == 0){
					contador++;
				}
			}
			if(contador == 2){
				primos[posicao++] = numero;
			}
		}
        posicao = 0;
        System.out.println("Matriz de primos:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = primos[posicao++];
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }    
    }

}
