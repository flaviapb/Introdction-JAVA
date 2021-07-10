package atividades;

import java.util.ArrayList;

public class TimeFutebol extends Jogadores{
	
	private ArrayList<Jogadores> lista_jogadores;

	
	public TimeFutebol(int id, String nome, String apelido, TipoDoJogador posicao, Selecao nomeselecao, int qualidade) {
		super(id, nome, apelido, posicao, nomeselecao, qualidade);
			}

	public ArrayList<Jogadores> getLista_jogadores() {
		return lista_jogadores;
	}

	public void setLista_jogadores(ArrayList<Jogadores> lista_jogadores) {
		this.lista_jogadores = lista_jogadores;
	}
	
	
}
