package br.com.desafiocapgemini.questao3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComparadorTest {

	@Test
	@DisplayName("Retornar valor boleano true quando as palavras forem anagramas uma da outra")
	void testeSaoAnagramasQuandoForVerdadeiroEntaoRetorneVerdadeiro() {
		String palavra1 = "asffq";
		String palavra2 = "qfsfa";
		Comparador comparador = new Comparador();

		Boolean resultado = comparador.saoAnagramas(palavra1, palavra2);

		assertTrue(resultado);
	}

	@Test
	@DisplayName("Retornar valor boleano false quando as palavras não forem anagramas uma da outra")
	void testeSaoAnagramasQuandoForFalsoEntaoRetorneFalso() {
		String palavra1 = "asffq";
		String palavra2 = "tsffw";
		Comparador comparador = new Comparador();

		Boolean resultado = comparador.saoAnagramas(palavra1, palavra2);

		assertFalse(resultado);
	}

}
