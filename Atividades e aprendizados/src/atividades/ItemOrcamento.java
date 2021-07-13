package atividades;

public class ItemOrcamento {
	
	private String historico;
	private float valor;
	
	public ItemOrcamento(String historico, float valor) {
		this.historico = historico;
		this.valor = valor;
	}
	
	public ItemOrcamento() {
		
	}
	
	public String getHistorico() {
		return historico;
	}
	
	public float getValor() {
		return valor;
	}
}
