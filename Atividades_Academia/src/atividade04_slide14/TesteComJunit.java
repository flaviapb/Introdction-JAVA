package atividade04_slide14;

import junit.framework.TestCase;


//TESTANDO O TITULO E A QUANTIDADE DE P�GINAS, QUE ESTAVA DESCRITO NA QUEST�O, PARA ENTENDER O JUNIT

public class TesteComJunit extends TestCase{

	Livros favorito = new Livros("O pequeno principe",98);
	
	public void testelivros() {
		
		String esperada = "O pequeno principe";
		assertEquals(esperada, favorito.getTitulo());
		
		int qntdpaginasEsperadas = 98;
		assertEquals(qntdpaginasEsperadas, 98);		
	}
}
