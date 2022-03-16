public class Ex05 {
    
    public static void main(String[] args) {
        int dividendo = (int) (Math.random() * 1000);
        int divisor = (int) (Math.random() * 20);
        if(dividendo % divisor == 0) {
            System.out.println("O número " + dividendo + " é divisível por " + divisor);
        } else {
            System.out.println("O número " + dividendo + " não é divisível por " + divisor);
        }
    }

}
