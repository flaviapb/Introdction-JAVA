package atividades;

/*
 * @author FláviaRenata
 * 
 * */

public class Cliente{

	private String nome;
	private String cpf;
	private String sobrenome;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public void Exibirnome() {
		System.out.printf("\nNome do cliente1: %s\n", nome);
	}	
}