public class Ex56 {

    public static void main(String[] args) {
        int numero, acumuladora;
        for (int i = 1; i <= 900; i++) {
            numero = i;
            acumuladora = 0;
            for (int j = 1; j < numero; j++) {
                if (numero % j == 0) {
                    acumuladora += j;
                }
            }
            if (acumuladora == numero) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }

}
