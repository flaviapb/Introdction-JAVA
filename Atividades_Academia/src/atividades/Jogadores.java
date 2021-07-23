package atividades;

public class Jogadores {

	private int qualidade, id;
	private String nome,apelido;
	private TipoDoJogador posicao; //enum da outra questão;
	private Selecao nomeselecao;
	
	
	public Jogadores() {
		
	}
	
	public Jogadores(int id,String nome, String apelido, TipoDoJogador posicao, Selecao nomeselecao, int qualidade) {
		
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.posicao = posicao;
		this.nomeselecao = nomeselecao;
		this.qualidade = qualidade;
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
	
	public TipoDoJogador getPosicao() {
		return posicao;
	}

	public void setPosicao(TipoDoJogador posicao) {
		this.posicao = posicao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public Selecao getNomeselecao() {
		return nomeselecao;
	}

	public void setNomeselecao(Selecao nomeselecao) {
		this.nomeselecao = nomeselecao;
	}
	
}
