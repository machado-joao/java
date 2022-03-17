public class Conta {
    private double valorTotalConta;
    private double valorContaDividida;
    private double gorjeta;
    private int quantidadePessoas;

    public Conta() {
        this.valorTotalConta = 0.0;
        this.valorContaDividida = 0.0;
        this.gorjeta = 0.0;
    }

    public double valorSemGorjeta(double valorTotalDaConta, int quantidadePessoas) {
        this.valorTotalConta = valorTotalDaConta;
        this.quantidadePessoas = quantidadePessoas;
        valorContaDividida = this.valorTotalConta / this.quantidadePessoas;
        return valorContaDividida;
    }

    public double valorComGorjeta(double valorTotalConta, int quantidaPessoas) {
        this.gorjeta = valorTotalConta * 0.1;
        this.valorTotalConta = valorTotalConta + this.gorjeta;
        this.quantidadePessoas = quantidaPessoas;
        valorContaDividida = this.valorTotalConta / this.quantidadePessoas;
        return valorContaDividida;
    }
}
