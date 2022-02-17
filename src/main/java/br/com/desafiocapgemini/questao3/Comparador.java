package br.com.desafiocapgemini.questao3;

import java.util.HashMap;
import java.util.Map;

public class Comparador {
	public boolean saoAnagramas(String palavra1, String palavra2) {
		Map<Character, Integer> mapa1 = mapear(palavra1);
		Map<Character, Integer> mapa2 = mapear(palavra2);
		return mapa1.equals(mapa2);
	}

	private Map<Character, Integer> mapear(String palavra) {
		Map<Character, Integer> mapa = new HashMap<>();
		for (char ch : palavra.toCharArray())
			mapa.put(ch, mapa.getOrDefault(ch, 0) + 1);
		return mapa;
	}
}
