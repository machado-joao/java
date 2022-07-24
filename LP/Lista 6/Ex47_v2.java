public class Ex47_v2 {

    public static void main(String[] args) {
        System.out.println("Crivo de Eratóstenes");
        boolean[] primos = crivo(100);
        for (int i = 2; i < primos.length; i++) {
            if (primos[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static boolean[] crivo(int n) {
        boolean[] primos = new boolean[n];

        for (int i = 2; i < n; i++) {
            primos[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if (primos[i]) {
                for (int j = i; i * j < n; j++) {
                    primos[i * j] = false;
                }
            }
        }
        return primos;
    }

}
