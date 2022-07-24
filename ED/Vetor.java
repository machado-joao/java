public class Vetor {
	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adicionar(String elemento) {
	 * for(int i = 0; i < this.elementos.length; i++) {
	 * if(this.elementos[i] == null) {
	 * this.elementos[i] = elemento;
	 * break;
	 * }
	 * }
	 * }
	 */

	/*
	 * public void adicionar(String elemento) throws Exception {
	 * if(this.tamanho < this.elementos.length) {
	 * this.elementos[this.tamanho] = elemento;
	 * this.tamanho++;
	 * } else {
	 * throw new
	 * Exception("O vetor já está cheio, não é possível adicionar o elemento.");
	 * }
	 * 
	 * }
	 */

	public boolean adicionar(String elemento) {
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adicionar(int posicao, String elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		this.aumentarCapacidade();
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public String buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}

	public int buscar(String elemento) {
		// Busca sequencial
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append("]");
		}
		return s.toString();
	}
}
