package atividade05;

import java.util.ArrayList;

public class DespesasTotal{

	private ArrayList<DespesaDia> totaldispesa;
	private String cpf;
	
	public DespesasTotal(String cpf, ArrayList<DespesaDia> totaldispesa) {
		this.totaldispesa =totaldispesa;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public float totalMes( int mes) {
		float soma = 0;
		for (int i = 0; i < totaldispesa.size(); i++) {
			soma += (totaldispesa.get(i).getValor());
		}
		
		return soma;
		
	}
}
