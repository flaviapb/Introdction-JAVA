package atividade04_slide14;

import junit.framework.TestCase;


//TESTANDO O TITULO E A QUANTIDADE DE PÁGINAS, QUE ESTAVA DESCRITO NA QUESTÃO, PARA ENTENDER O JUNIT

public class TesteComJunit extends TestCase{

	Livros favorito = new Livros("O pequeno principe",98);
	
	public void testelivros() {
		
		String esperada = "O pequeno principe";
		assertEquals(esperada, favorito.getTitulo());
		
		int qntdpaginasEsperadas = 98;
		assertEquals(qntdpaginasEsperadas, 98);		
	}
}
