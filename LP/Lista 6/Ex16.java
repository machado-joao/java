public class Ex16 {
    
    public static void main(String[] args) {
        int somaIntervalo = 0;
        int contador = 0;
        for(int i = 15; i <= 100; i++) {
            somaIntervalo += i;
            contador++;
        }
        double media = (double) somaIntervalo / contador;
        System.out.printf("A média da soma dos valores no intervalo [%d,%d] é %.2f\n", 15, 100, media);
    }

}
