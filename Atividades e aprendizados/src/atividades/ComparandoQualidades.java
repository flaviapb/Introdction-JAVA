package atividades;

import java.util.Comparator;

public class ComparandoQualidades implements Comparator<Jogadores> {

	public int compare(Jogadores jogador1, Jogadores jogador2) {
			
		return jogador2.getQualidade() - jogador1.getQualidade();
	}
}
