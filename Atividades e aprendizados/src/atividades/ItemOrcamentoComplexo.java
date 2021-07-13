package atividades;

import java.util.ArrayList;

public class ItemOrcamentoComplexo extends ItemOrcamento {
	
	private ArrayList<ItemOrcamento> subItens;
	 
	public ItemOrcamentoComplexo(ArrayList<ItemOrcamento> subItens) {
		this.subItens = subItens;
	}
	 
	public float getValor() {
		float somaItens = 0;
		for (ItemOrcamento itens: subItens) { 
			somaItens += itens.getValor(); 
		}
		return somaItens;
	}
	
	
	public String encontreItem(String historico) {
		for(ItemOrcamento itens: subItens){
	        if (itens.getHistorico().equals(historico)){
	           return "Esse produto se encontra na lista de itens";
	        }
	    }
	       return "Esse produto não se encontra na lista de itens";
	}	
}
