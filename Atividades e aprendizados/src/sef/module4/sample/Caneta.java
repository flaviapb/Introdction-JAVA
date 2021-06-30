package sef.module4.sample;

public class Caneta {
	private String cor;
	private String marca;
	private boolean vazia;
	private boolean tampada;
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isVazia() {
		return vazia;
	}

	public void setVazia(boolean vazia) {
		this.vazia = vazia;
	}

	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void Destampar() {
		tampada = false;
	}
	
	public void Tampar() {
		tampada = true;
	}
	
	public void Riscar() {
		if (tampada) {
			System.out.println("Não posso riscar, pois a Caneta esta tampada..");
		} else {
			System.out.println("Riscando....");			
		}
	}
	
	public void Exibir() {
		System.out.println("Cor = "+cor);
		System.out.println("marca = "+marca);
		System.out.println("Vazia = "+ vazia);
		System.out.println("Tampada = "+ tampada);
	}
}