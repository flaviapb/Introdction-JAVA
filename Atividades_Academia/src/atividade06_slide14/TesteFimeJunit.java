package atividade06_slide14;

import junit.framework.TestCase;

public class TesteFimeJunit extends TestCase{

	Filme filme1 = new Filme("Os Vingadores",142);
	Filme filme2 = new Filme("Hotel Transilvânia",93);
	
	public void testarFilmes() {
		
		//String nomeFilme1 = "Moana"; //FORÇANDO UM ERRO, PARA TESTAR, TIRE O COMENTÁRIO
		String nomeFilme1 = "Os Vingadores";
		assertEquals("Os Vingadores", nomeFilme1);
		
		String nomeFilme2 = "Hotel Transilvânia";
		assertEquals("Hotel Transilvânia", nomeFilme2);
		
		int minutosFime1 = 142;
		assertEquals(142, minutosFime1);
		
		//int minutoFilme2 = 160; //FORÇANDO UM ERRO, PARA TESTAR, TIRE O COMENTÁRIO
		int minutoFilme2 = 93;
		assertEquals(93, minutoFilme2);		
	}
}
