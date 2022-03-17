public class Ex03 {

    public static void main(String[] args) throws Exception {
        Ano ano = new Ano();

        ano.setAno(2020);
        System.out.println("Ano: " + ano.getAno());
        System.out.println("O ano é bissexto? " + (ano.isBissexto(ano.getAno()) ? "Sim" : "Não"));
    }

}
