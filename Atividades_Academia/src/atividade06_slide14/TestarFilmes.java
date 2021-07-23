package atividade06_slide14;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class TestarFilmes {

	public static void main(String[] args) {
		
		//Usar no JoptionPane
		String vezesString;
		int vezes;
						
		//Para usar no for
		vezesString = JOptionPane.showInputDialog("Quantos filmes você quer analisar? ");
		vezes = Integer.parseInt(vezesString);
		
		ArrayList<Filme> FILMES = new ArrayList<Filme>();
		
		System.out.print("\n-----------------DADOS SOBRE O(S) FILME(S): -----------------------\n");
		
		for (int i = 0; i < vezes; i++) {
			
			String nome = JOptionPane.showInputDialog("Quantos nome do filme? ").toUpperCase();
			
			String minuto = JOptionPane.showInputDialog("Quantos minutos tem nesse filme? ").toUpperCase();
			int minutos = Integer.parseInt(minuto);
			
			Filme filme = new Filme(nome,minutos);
			
			filme.exibirDuracaoEmHoras();
			
			FILMES.add(filme);
			
		}
		
		System.out.print("\n-----------------FILME(S) EM CARTAZ(ES): -----------------------\n");
		
		for (int i = 0; i < FILMES.size(); i++) {
			
			System.out.print(FILMES.get(i).getNomeFilme() + "\n");
			
		}
		
	}

}
