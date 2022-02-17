package br.com.desafiocapgemini.questao3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SeparadorTest {

	@Test
	@DisplayName("Retornar um array com 6 substrings quando a string tiver 6 possíveis substrings")
	void testeListarSubstringsQuandoStringPossuir6SubstringsEntaoetorneListaCom6Substrings() {
		String palavra = "abc";
		Separador separador = new Separador();

		ArrayList<String> resultado = separador.listarSubstrings(palavra);

		ArrayList<String> esperado = new ArrayList<>(List.of("a", "ab", "abc", "b", "bc", "c"));
		assertTrue(esperado.equals(resultado));
	}

	@Test
	@DisplayName("Retornar um array com 3 substrings quando a string tiver 3 possíveis substrings")
	void testeListarSubstringsQuandoStringPossuir4SubstringsEntaoRetorneListaCom4Substrings() {
		String palavra = "wo";
		Separador separador = new Separador();

		ArrayList<String> resultado = separador.listarSubstrings(palavra);

		ArrayList<String> esperado = new ArrayList<>(List.of("w", "wo", "o"));
		assertTrue(esperado.equals(resultado));
	}

}
