package atividades;

/*
 * @author Fl�viaRenata
 * 
 * */

public class Camisa {
	
	private String nome; // nome de quem vai comprar a camisa
	private String cor; //Cor da camisa
	private double preco; // Pre�o da camisa
	private String tipo; // Camisa polo, basica, manga longa.
	
	
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public String gettipo() {
		return tipo;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
	public double getpreco() {
		return preco;
	}
	
	public void setpreco(double preco) {
		this.preco = preco;
	}

	
	public void Exibir() {
		System.out.printf("\nOl� %s, logo abaixo vamos das as informa��es sobre seu pedido.\n", nome);
		System.out.printf("A cor escolhida por voc� foi %s.\n", cor);
		System.out.printf("O tipo de camisa escolhida por voc� foi %s.\n", tipo);
		System.out.printf("O valor da camisa escolhida por voc� foi %.2f.\n", preco);
	}
}
