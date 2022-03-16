public class Ex29 {
    
    public static void main(String[] args) {
        int inicio = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
            if(i % 2 != 0) {
                inicio = 1;
            } else {
                inicio = 2;
            }
            for(int j = inicio; j <= 10; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
