public class Venda {
	private String nome;
	private int total;
	private boolean presencial;
	private int pontos;
	
	public Venda(String nome, int total, boolean presencial) {
		this.nome = nome;
		this.total = total;
		this.presencial = presencial;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public boolean getPresencial() {
		return presencial;
	}

	public int getPontos() {
		return pontos;
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	@Override
	public String toString() {
			return String.format("As vendas efetuadas por %s, totalizando %d vendas foi realizada %s", getNome(), getTotal(), (getPresencial() ? "presencialmente" : "remotamente"));
	}
}
