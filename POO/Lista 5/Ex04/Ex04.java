import java.util.Random;

public class Ex04 {

    public static void main(String[] args) throws Exception {
        Random gerador = new Random();
        Data datas[] = new Data[12];
        System.out.println("Datas: ");
        for(int i = 0; i < datas.length; i++) {
            int dia = gerador.nextInt(31) + 1;
            int mes = gerador.nextInt(12) + 1;
            int ano = gerador.nextInt(2021) + 1;
            datas[i] = new Data(dia, mes, ano);
            System.out.println(datas[i].mostrarData());
        }
    }
    
}
