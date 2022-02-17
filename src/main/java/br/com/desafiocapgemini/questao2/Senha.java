package br.com.desafiocapgemini.questao2;

import java.util.regex.Pattern;

public class Senha {
	private String valor;
	
	public Senha(String valor) {
		this.valor = valor;
	}
	
	public String getValor() {
		return valor;
	}
	
	public Integer getComprimento() {
		return valor.length();
	}
	
	public boolean temDigitos() {
		return valorContem("[0-9]");
	}
	
	public boolean temMinusculo() {
		return valorContem("[a-z]");
	}
	
	public boolean temMaiusculo() {
		return valorContem("[A-Z]");
	}
	
	public boolean temEspeciais() {
		return valorContem("[^\\w]");
	}
	
	private boolean valorContem(String padraoRegex) {
		return Pattern.compile(padraoRegex).matcher(valor).find();
	}
}
	
