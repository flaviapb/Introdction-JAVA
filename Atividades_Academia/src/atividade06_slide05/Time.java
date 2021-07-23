package atividade06_slide05;

public class Time {
	
	private int qualidade, id;
	private String nome,apelido;
	private TitularOuReserva tipoJogador;
	
	public Time(){
		
	}
	
	public Time(int id,String nome, String apelido, TitularOuReserva tipoJogador,int qualidade) {
		
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.qualidade = qualidade;
		this.setTipoJogador(tipoJogador);
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public TitularOuReserva getTipoJogador() {
		return tipoJogador;
	}

	public void setTipoJogador(TitularOuReserva tipoJogador) {
		this.tipoJogador = tipoJogador;
	}

}