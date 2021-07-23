package atividade04_slide14;

import javax.swing.JOptionPane;

public class TestarLivros {

	public static void main(String[] args) {

		//Usar no JoptionPane
		String vezesString;
		int vezes;
				
		//Para usar no for
		vezesString = JOptionPane.showInputDialog("Quantos livros você quer analisar o progesso? ");
		vezes = Integer.parseInt(vezesString);
				
		//Para instanciar os livros
		String titulo, totallidas, totallivro;
		int paginaslidas, paginaslivro;
				
		//Cadastranfo/instanciando livros
		for (int i = 0; i < vezes; i++) {
			titulo = JOptionPane.showInputDialog("Digite o titulo do seu livro: ");
					
			totallivro = JOptionPane.showInputDialog("Digite o número de páginas do seu livro: ");
			paginaslivro = Integer.parseInt(totallivro);
					
			totallidas = JOptionPane.showInputDialog("Digite o número de páginas que você leu do seu livro: ");
			paginaslidas = Integer.parseInt(totallidas);
					
					
			Livros livrofavorito = new Livros(titulo,paginaslivro);
					
			System.out.printf("\nO livro %s possui %d páginas;", livrofavorito.getTitulo(), livrofavorito.getQntdPaginas());
					
			livrofavorito.verificarProgresso(paginaslivro,paginaslidas);
		}
		
	}

}
