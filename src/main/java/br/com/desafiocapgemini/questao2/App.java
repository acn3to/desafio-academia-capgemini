package br.com.desafiocapgemini.questao2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Senha senha = perguntarSenha();
		VerificadorDeSenha verificador = new VerificadorDeSenha();
		Integer resultado = verificador.getCaracteresFaltando(senha);
		System.out.print(resultado);
	}

	private static Senha perguntarSenha() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite sua senha: ");
		String input = sc.nextLine();
		sc.close();
		return new Senha(input);
	}

}
