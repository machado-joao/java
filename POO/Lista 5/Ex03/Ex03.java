public class Ex03 {

    public static void main(String[] args) throws Exception {
        Lampada lampada = new Lampada("Philips", "Tubular", "LED");

        System.out.println("Lâmpada (estado inicial): " + lampada.toString());
        for(int i = 1; i <= 3; i++) {
            lampada.mudarEstado();
            System.out.println("Lâmpada: " + lampada.toString());
        }
    }
    
}
