package br.com.desafiocapgemini.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SenhaTest {

	@Test
	@DisplayName("Retornar o valor 4 quando a senha possuir 4 caracteres")
	void testeGetComprimentoQuandoForDigitadaUmaSenhaCom4CaracteresEntaoRetorne4() {
		String senhaDigitada = "yA+2";
		Senha senha = new Senha(senhaDigitada);

		Integer resultado = senha.getComprimento();

		Integer esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor 6 quando a senha possuir 6 caracteres")
	void testeGetComprimentoQuandoForDigitadaUmaSenhaCom6CaracteresEntaoRetorne6() {
		String senhaDigitada = "aaaaaa";
		Senha senha = new Senha(senhaDigitada);

		Integer resultado = senha.getComprimento();

		Integer esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano true quando a senha possuir digitos")
	void testeTemDigitosQuandoHouverAlgumDigitoEntaoRetorneTrue() {
		String senhaDigitada = "4aas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temDigitos();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano false quando a senha não possuir digitos")
	void testeTemDigitosQuandoNaoHouverAlgumDigitoEntaoRetorneFalse() {
		String senhaDigitada = "dssaas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temDigitos();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano true quando a senha possuir caracteres minúsculos")
	void testeTemMinusculoQuandoHouverAlgumCaractereMinusculoEntaoRetorneTrue() {
		String senhaDigitada = "dssaas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMinusculo();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano false quando a senha não possuir caracteres minúsculos")
	void testeTemMinusculoQuandNaoHouverAlgumCaractereMinusculoEntaoRetorneFalse() {
		String senhaDigitada = "333A+A";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMinusculo();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano true quando a senha possuir caracteres maiúsculos")
	void testeTemMaiusculoQuandoHouverAlgumCaractereMaiusculoEntaoRetorneTrue() {
		String senhaDigitada = "WWa23s";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMaiusculo();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano false quando a senha não possuir caracteres maiúsculos")
	void testeTemMaiusculoQuandNaoHouverAlgumCaractereMaiusculoEntaoRetorneFalse() {
		String senhaDigitada = "aassqw2+";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMaiusculo();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano true quando a senha possuir caracteres especiais")
	void testeTemEspecialQuandoHouverAlgumCaractereEspecialEntaoRetorneTrue() {
		String senhaDigitada = "aasw+eE";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temEspeciais();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor boleano false quando a senha não possuir caracteres especiais")
	void testeTemEspecialQuandoNaoHouverAlgumCaractereEspecialEntaoRetorneFalse() {
		String senhaDigitada = "dsdsK3";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temEspeciais();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

}
