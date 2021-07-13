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
	
	
	@SuppressWarnings("unlikely-arg-type")
	public String encontreItem(String historico) {
		if(subItens.contains(historico)){
	         return "encontra-se na lista de itens.";
	    }else{
	         return "não se encontra na lista de itens.";
	     }
	}
		
}
