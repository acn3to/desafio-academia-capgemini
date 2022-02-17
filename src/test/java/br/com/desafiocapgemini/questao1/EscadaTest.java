package br.com.desafiocapgemini.questao1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EscadaTest {
	
    @Test
    @DisplayName("Retornar uma escada com 1 de base e altura quando o input for 1")
    void testeToStringQuandoEscadaTiver1DegrauEntaoRetorneStringEsperada(){
    	Integer degraus = 1;
    	Escada escada = new Escada(degraus);
    	
    	String resultado = escada.toString();
    	
    	String esperado = "*\n";
    	assertEquals(esperado, resultado);
    }
    
    @Test
    @DisplayName("Retornar uma escada com 5 de base e altura quando o input for 5")
    void testeToStringQuandoEscadaTiver5DegrausEntaoRetorneStringEsperada(){
    	Integer degraus = 5;
    	Escada escada = new Escada(degraus);
    	
    	String resultado = escada.toString();
    	
    	String esperado = "    *\n   **\n  ***\n ****\n*****\n";
    	assertEquals(esperado, resultado);
    }
}