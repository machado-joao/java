public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {
        this.nome = null;
        this.idade = 0;
        this.altura= 0.0;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void fazerAniversario() {
        this.idade += 1;
    }
}
