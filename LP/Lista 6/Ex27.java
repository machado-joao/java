public class Ex27 {
    
    public static void main(String[] args) {
        int auxiliar = 10;
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
            for(int j = 1; j <= auxiliar; j++) {
                System.out.print(j + " ");
            }
            auxiliar--;
            System.out.println();
        }
    }

}
