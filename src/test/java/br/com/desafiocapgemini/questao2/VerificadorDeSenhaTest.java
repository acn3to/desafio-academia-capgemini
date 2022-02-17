package br.com.desafiocapgemini.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class VerificadorDeSenhaTest {

	@Test
	@DisplayName("Retornar o valor 3 quando faltarem 3 requisitos para a senha ser considerada forte")
	void testeGetCaracteresFaltandoQuandoFaltarem3CaracteresNaSenhaEntaoRetorne3() {
		String senhaDigitada = "Ya3";
		Senha senha = new Senha(senhaDigitada);
		VerificadorDeSenha verificador = new VerificadorDeSenha();

		Integer resultado = verificador.getCaracteresFaltando(senha);

		Integer esperado = 3;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor 0 quando a senha for considerada forte")
	void testeGetCaracteresFaltandoQuandoFaltarem0CaracteresNaSenhaEntaoRetorne0() {
		String senhaDigitada = "Ya3+22";
		Senha senha = new Senha(senhaDigitada);
		VerificadorDeSenha verificador = new VerificadorDeSenha();

		Integer resultado = verificador.getCaracteresFaltando(senha);

		Integer esperado = 0;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor 2 quando a  senha possuir 2 dos tipos de caracteres necessários")
	void testeContarTipoDeCaracteresQuandoAsenhaTiver2dosTiposNecessariosEntaoRetorne2() {
		String senhaDigitada = "Y3AS32";
		Senha senha = new Senha(senhaDigitada);
		VerificadorDeSenha verificador = new VerificadorDeSenha();

		Integer resultado = verificador.contarTipoDeCaracteres(senha);

		Integer esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor 4 quando a senha possuir 4 dos tipos de caracteres necessários")
	void testeContarTipoDeCaracteresQuandoAsenhaTiver4dosTiposNecessariosEntaoRetorne4() {
		String senhaDigitada = "y3A+";
		Senha senha = new Senha(senhaDigitada);
		VerificadorDeSenha verificador = new VerificadorDeSenha();

		Integer resultado = verificador.contarTipoDeCaracteres(senha);

		Integer esperado = 4;
		assertEquals(esperado, resultado);
	}

}