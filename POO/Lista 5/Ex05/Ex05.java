public class Ex05 {

    public static void main(String[] args) throws Exception {
        Equacao equacao1 = new Equacao(3, 12, -63);
        Equacao equacao2 = new Equacao(1, -14, 48);

        System.out.println("Equação 1: " + equacao1.mostrarRaizes());
        System.out.println("Equação 2: " + equacao2.mostrarRaizes());
    }
    
}
