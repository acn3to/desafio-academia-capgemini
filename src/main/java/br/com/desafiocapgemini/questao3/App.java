package br.com.desafiocapgemini.questao3;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		String palavra = perguntarPalavra();
		ContadorDeAnagramas contadorDeAnagramas = new ContadorDeAnagramas();
		Integer resultado = contadorDeAnagramas.contar(palavra);
		System.out.print(resultado);
	}

	private static String perguntarPalavra() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String input = sc.nextLine();
		sc.close();
		return input;
	}
}
