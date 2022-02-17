package br.com.desafiocapgemini.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SenhaTest {

	@Test
	void testSenha() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValor() {
		fail("Not yet implemented");
	}

	@Test
	@DisplayName("Retorna o valor 4 quando a senha possuir 4 caracteres")
	void testeGetComprimentoQuandoForDigitadoUmaSenhaCom4CaracteresEntaoRetorne4() {
		String senhaDigitada = "yA+2";
		Senha senha = new Senha(senhaDigitada);

		Integer resultado = senha.getComprimento();

		Integer esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retorna o valor 6 quando a senha possuir 6 caracteres")
	void testeGetComprimentoQuandoForDigitadoUmaSenhaCom6CaracteresEntaoRetorne6() {
		String senhaDigitada = "aaaaaa";
		Senha senha = new Senha(senhaDigitada);

		Integer resultado = senha.getComprimento();

		Integer esperado = 6;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retorna o valor boleano true quando a senha possuir digitos")
	void testeTemDigitosQuandoHouverAlgumDigitoEntaoRetorneTrue() {
		String senhaDigitada = "4aas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temDigitos();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retorna o valor boleano false quando a senha não possui digitos")
	void testeTemDigitosQuandoQuandoNaoHouverAlgumDigitoEntaoRetorneFalse() {
		String senhaDigitada = "dssaas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temDigitos();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retorna o valor boleano true quando a senha possui caracteres minúsculos")
	void testeTemMinusculoQuandoHouverAlgumCaractereMinusculoEntaoRetorneTrue() {
		String senhaDigitada = "dssaas";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMinusculo();

		Boolean esperado = true;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retorna o valor boleano false quando a senha não possuir caracteres minúsculos")
	void testeTemMinusculoQuandoNaoHouverAlgumCaractereMinusculoEntaoRetorneFalse() {
		String senhaDigitada = "333A+A";
		Senha senha = new Senha(senhaDigitada);

		Boolean resultado = senha.temMinusculo();

		Boolean esperado = false;
		assertEquals(esperado, resultado);
	}

	@Test
	void testTemMaiusculo() {
		fail("Not yet implemented");
	}

	@Test
	void testTemEspeciais() {
		fail("Not yet implemented");
	}

}
