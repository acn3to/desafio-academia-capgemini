package br.com.desafiocapgemini.questao3;

import java.util.ArrayList;

public class Separador {
	public ArrayList<String> listarSubstrings(String palavra) {
		ArrayList<String> resultado = new ArrayList<String>();
		for (int i = 0; i < palavra.length(); i++) {
			for (int j = i + 1; j <= palavra.length(); j++) {
				String substrig = palavra.substring(i, j);
				resultado.add(substrig);
			}
		}
		return resultado;
	}

}
