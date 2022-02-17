package br.com.desafiocapgemini.questao3;

import java.util.ArrayList;

public class ContadorDeAnagramas {
	private Comparador comparador;
	private Separador separador;

	public ContadorDeAnagramas() {
		comparador = new Comparador();
		separador = new Separador();

	}

	public Integer contar(String palavra) {
		ArrayList<String> substrings = separador.listarSubstrings(palavra);
		Integer resultado = 0;
		for (int i = 0; i < substrings.size() - 1; i++) {
			for (int j = i + 1; j <= substrings.size() - 1; j++) {
				Boolean saoAnagramas = comparador.saoAnagramas(substrings.get(i), substrings.get(j));
				if (saoAnagramas) {
					resultado++;
				}
			}
		}
		return resultado;
	}
}
