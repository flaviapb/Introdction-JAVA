package atividades;

public class ItemOrcamentoComplexo extends ItemOrcamento {
	
	ItemOrcamento subItems[];
	 
	public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento subItems[]) {
		super (historico,valor);
	}
	
	public float getValor() {
		float somaItens = 0;
		
		for (int i = 0; i < subItems.length; i++) { 
			somaItens += subItems[i].getValor();
		}
		return somaItens;
	}
	
	
	
	public ItemOrcamento encontrarItem(String historico) {
		for (int i = 0; i < subItems.length; i++) {
			if(this.subItems[i].getHistorico().equals(historico)) {
				return subItems[i];
			}
		}
		return null;
	}
}
