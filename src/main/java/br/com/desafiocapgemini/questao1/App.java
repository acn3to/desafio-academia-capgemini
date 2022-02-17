package br.com.desafiocapgemini.questao1;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor de n: ");

		try {
			int degraus = Integer.parseInt(sc.nextLine());
			Escada escada = new Escada(degraus);
			System.out.print(escada.toString());
		} catch (NumberFormatException a) {
			System.out.print("Input invalido");
		}

		sc.close();
	}

}
