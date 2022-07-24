public class Ex20_v2 {

    public static void main(String[] args) {
        int maior = 0, menor = 0;
        for (int i = 1; i <= 100; i++) {
            int valor = (int) (Math.random() * 100) + 1;
            if (i == 1) {
                maior = valor;
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
        }
        System.out.println("Maior valor encontrado: " + maior);
        System.out.println("Menor valor encontrado: " + menor);
    }

}
