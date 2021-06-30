package atividades;

public class Carro {

	private String propietario;
	private String marca;
	private String cor;
	private boolean buzinando;
	private double valor;
	
	
	public String getpropietario(){
		return propietario;
	}
	
	public void setpropietario(String propietario) {
		this.propietario = propietario;
	}
	
	public String getmarca(){
		return marca;
	}
	
	public void setmarca( String marca) {
		this.marca = marca;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public double getvalor() {
		return valor;
	}
	
	public void setvalor(double valor) {
		this.valor = valor;
	}
	
	public boolean getbuzinando() {
		return buzinando;
	}
	
	public void setbuzinando(boolean buzinando) {
		this.buzinando = buzinando;
	}
	
	public void Buzinando() {
		buzinando = true;
	}
	
	public void NaoBuzinando() {
		buzinando = false;
	}
	
	public void Buzinar() {
		if (buzinando == true) {
			System.out.println("\nBUZINANDO....");
		}
		
		else if(buzinando == false) {
			System.out.println("\nBuzina não ativada");
		}
	}
	
	public void Exibir() {
		
		System.out.printf("\nOlá senhor(a) %s, segue informações do seu carro:\n"
				+ "A cor informada: %s\n"
				+ "A marca informada: %s\n"
				+ "O valor informado: %f\n",propietario,cor,marca,valor);
	}
}
