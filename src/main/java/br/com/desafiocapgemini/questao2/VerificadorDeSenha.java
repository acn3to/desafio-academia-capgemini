package br.com.desafiocapgemini.questao2;

public class VerificadorDeSenha {

	public Integer getCaracteresFaltando(Senha senha) {
		Integer tiposDeCaracteresNecessarios = 4;
		Integer tamanhoMinimo = 6;
		Integer caracteresFaltando;

		caracteresFaltando = tiposDeCaracteresNecessarios - contarTipoDeCaracteres(senha);
		Integer novoTamanho = senha.getComprimento() + caracteresFaltando;

		if (novoTamanho >= tamanhoMinimo) {
			return caracteresFaltando;
		} else {
			return tamanhoMinimo - senha.getComprimento();
		}
	}

	public Integer contarTipoDeCaracteres(Senha senha) {
		Integer resultado = 0;
		if (senha.temDigitos()) {
			resultado++;
		}
		if (senha.temEspeciais()) {
			resultado++;
		}
		if (senha.temMaiusculo()) {
			resultado++;
		}
		if (senha.temMinusculo()) {
			resultado++;
		}
		return resultado;
	}

}
