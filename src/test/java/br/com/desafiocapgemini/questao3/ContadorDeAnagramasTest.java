package br.com.desafiocapgemini.questao3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContadorDeAnagramasTest {

	@Test
	@DisplayName("Retornar o valor 3 quando houverem 3 anagramas")
	void testaContarQuandoHouverem3PossiveisAnagramasEntaoRetorna3() {
		String palavra = "ifailuhkqq";
		ContadorDeAnagramas contadorDeAnagramas = new ContadorDeAnagramas();

		Integer resultado = contadorDeAnagramas.contar(palavra);

		Integer esperado = 3;
		assertEquals(esperado, resultado);
	}

	@Test
	@DisplayName("Retornar o valor 2 quando houverem 2 anagramas")
	void testaContarQuandoHouverem2PossiveisAnagramasEntaoRetorna2() {
		String palavra = "ovo";
		ContadorDeAnagramas contadorDeAnagramas = new ContadorDeAnagramas();

		Integer resultado = contadorDeAnagramas.contar(palavra);

		Integer esperado = 2;
		assertEquals(esperado, resultado);
	}

}
