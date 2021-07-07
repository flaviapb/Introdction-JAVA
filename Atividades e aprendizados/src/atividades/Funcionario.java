package atividades;

public class Funcionario {
	
	private String nome, sobrenome;
	protected Integer horasTrabalhadas;
	protected double valorPorHora;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, String sobrenome) {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

		
	public void nomeCompleto() {
		System.out.printf("Olá %s %s.\n",nome,sobrenome);
	}
	
	public void calcularSalario() {
		System.out.printf("\nO seu salario considerando: "+
						  "\nHoras trabalhas: %d"+
						  "\nValor por hora: %.1f"+
						  "\nSeu salario: %.1f\n", horasTrabalhadas,valorPorHora,(horasTrabalhadas * valorPorHora));
	}
	
	public void incrementarHoras(Integer horas) {
		System.out.printf("\nValor por horas trabalhas: %.1f"+
						  "\nIncrementação das horas: %d"+
						  "\nTotal de horas final: %.1f\n",valorPorHora,horas,(valorPorHora += horas));
	}
	
	

}
