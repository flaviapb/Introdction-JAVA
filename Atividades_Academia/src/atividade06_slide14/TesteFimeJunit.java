package atividade06_slide14;

import junit.framework.TestCase;

public class TesteFimeJunit extends TestCase{

	Filme filme1 = new Filme("Os Vingadores",142);
	Filme filme2 = new Filme("Hotel Transilv�nia",93);
	
	public void testarFilmes() {
		
		//String nomeFilme1 = "Moana"; //FOR�ANDO UM ERRO, PARA TESTAR, TIRE O COMENT�RIO
		String nomeFilme1 = "Os Vingadores";
		assertEquals("Os Vingadores", nomeFilme1);
		
		String nomeFilme2 = "Hotel Transilv�nia";
		assertEquals("Hotel Transilv�nia", nomeFilme2);
		
		int minutosFime1 = 142;
		assertEquals(142, minutosFime1);
		
		//int minutoFilme2 = 160; //FOR�ANDO UM ERRO, PARA TESTAR, TIRE O COMENT�RIO
		int minutoFilme2 = 93;
		assertEquals(93, minutoFilme2);		
	}
}
