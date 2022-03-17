public class Ex01 {

    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Pedro");
        pessoa.setIdade(20);
        pessoa.setAltura(1.80);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Altura: " + pessoa.getAltura());
        pessoa.fazerAniversario();
        System.out.println("Nova idade: " + pessoa.getIdade());
    }
    
}
