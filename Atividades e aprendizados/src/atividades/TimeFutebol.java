package atividades;

import java.util.ArrayList;
import java.util.Collections;

public class TimeFutebol{
	
	private Jogadores dados;
	private ArrayList<Jogadores> time,relacionados;
	private Selecao nomeTime;
	private String fundacao;
	
	public TimeFutebol(Selecao nomeTime, String fundacao, ArrayList<Jogadores> time) {
		this.nomeTime = nomeTime;
		this.fundacao = fundacao;
		this.time = time;
	}
	
	//Selecionei os 23 jogadores, de forma decrescente
	public void relacionarJogadores(ArrayList<Jogadores> relacionados) {
		int totalRelacionados = 23;
		
		Collections.sort(time, new ComparandoQualidades());
		
		for (int i = 0; i < totalRelacionados; i++) {
			
			relacionados.add(time.get(i));
			System.out.print(relacionados.get(i).getId() + " --> " + relacionados.get(i).getNome() + " --> " + relacionados.get(i).getQualidade() + "\n");
			System.out.print("\n");
		}
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


	public ArrayList<Jogadores> getRelacionados() {
		return relacionados;
	}


	public void setRelacionados(ArrayList<Jogadores> relacionados) {
		this.relacionados = relacionados;
	}

}
