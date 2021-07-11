package atividades;

import java.util.ArrayList;

public class TimeFutebol{
	
	private Jogadores dados;
	private ArrayList<Jogadores> relacionados, time;
	private Selecao nomeTime;
	private String fundacao;
	
	
	
	
	public TimeFutebol(Selecao nomeTime, String fundacao, ArrayList<Jogadores> time) {
		this.nomeTime = nomeTime;
		this.fundacao = fundacao;
		this.time = time;
	}
	
	
	public void relacionarJogadores(ArrayList<Jogadores> relacionados) {
		dados.getQualidade();
		
		System.out.print(dados.getQualidade());
	}
	
	
	
	public Jogadores getDados() {
		return dados;
	}

	public void setDados(Jogadores dados) {
		this.dados = dados;
	}


	public ArrayList<Jogadores> getTime() {
		return time;
	}


	public void setTime(ArrayList<Jogadores> time) {
		this.time = time;
	}




	public ArrayList<Jogadores> getRelacionados() {
		return relacionados;
	}




	public void setRelacionados(ArrayList<Jogadores> relacionados) {
		this.relacionados = relacionados;
	}




	public Selecao getNomeTime() {
		return nomeTime;
	}




	public void setNomeTime(Selecao nomeTime) {
		this.nomeTime = nomeTime;
	}




	public String getFundacao() {
		return fundacao;
	}




	public void setFundacao(String fundacao) {
		this.fundacao = fundacao;
	}
}
