import java.util.Scanner;

public class Ex08 {
        
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int quantidade;
        do {
            System.out.print("Digite a quantidade de números: ");
            quantidade = sc.nextInt();
            if(quantidade < 1) {
                System.out.println("Digite um valor maior ou igual a 1!");
            }
        } while(quantidade < 1);
        int numeros[] = new int[quantidade];
        for(int i = 0; i < numeros.length; i++){
          System.out.print("Digite o " + (i + 1) + "° número: ");
          numeros[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("O MDC entre os números digitados é " + mdc(numeros));
    }

    private static int mdc(int a, int b){        
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    private static int mdc(int[] numeros){
        int resultado = numeros[0];
        for(int i = 1; i < numeros.length; i++){
            resultado = mdc(resultado, numeros[i]);
        }
        return resultado;
    }

}
