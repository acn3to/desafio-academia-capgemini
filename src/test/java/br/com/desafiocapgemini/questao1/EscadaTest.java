package br.com.desafiocapgemini.questao1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class EscadaTest {
	
    @Test
    void testeToStringQuandoEscadaTem1DegrauEntaoRetornaStringEsperada(){
    	Integer degraus = 1;
    	Escada escada = new Escada(degraus);
    	
    	String resultado = escada.toString();
    	
    	String esperado = "*\n";
    	assertEquals(esperado, resultado);
    }
    
    @Test
    void testeToStringQuandoEscadaTem5DegrausEntaoRetornaStringEsperada(){
    	Integer degraus = 5;
    	Escada escada = new Escada(degraus);
    	
    	String resultado = escada.toString();
    	
    	String esperado = "    *\n   **\n  ***\n ****\n*****\n";
    	assertEquals(esperado, resultado);
    }
}