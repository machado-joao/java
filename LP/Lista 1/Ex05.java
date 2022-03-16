public class Ex05 {
    
    public static void main(String[] args) {
        System.out.print("Primeira maneira:\n");
        System.out.print("*\n");
        System.out.print("**\n");
        System.out.print("***\n");
        System.out.print("****\n");
        System.out.print("*****\n");

        System.out.print("Segunda maneira:\n");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
