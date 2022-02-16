package br.com.desafiocapgemini.questao1;

public class Escada {
	private Integer degraus;

	public Escada(Integer degraus) {
		this.degraus = degraus;
	}

	public Integer getDegraus() {
		return degraus;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 1; i <= degraus; i++) {
			String espacoVazio = " ".repeat(degraus - i);
			String asteriscos = "*".repeat(i);
			String degrau = espacoVazio + asteriscos + "\n";
			stringBuilder.append(degrau);
		}

		return stringBuilder.toString();
	}
}
