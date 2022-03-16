public class Ex42 {
    
    public static void main(String[] args) {
        int fatorial;
        for(int i = 1; i <= 10; i++) {
            fatorial = 1;
            for(int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%d! = %d\n", i, fatorial);
        }
    }
}
