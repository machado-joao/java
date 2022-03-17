public class Ex02 {

    public static void main(String[] args) throws Exception {
        Calculadora calculadora = new Calculadora();

        calculadora.setNumero1(10);
        calculadora.setNumero2(5);
        System.out.println("Valor 1: " + calculadora.getNumero1());
        System.out.println("Valor 2: " + calculadora.getNumero2());
        System.out.println("Somar: " + calculadora.somar());
        System.out.println("Subtrair: " + calculadora.subtrair());
        System.out.println("Multiplicar: " + calculadora.multiplicar());
        System.out.println("Dividir: " + calculadora.dividir());
    }
    
}
