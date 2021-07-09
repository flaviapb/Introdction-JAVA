package atividades;

import java.time.LocalDate;
import java.util.Random;



public class Jogador {

	private int id, qntd_cartoes,numero_cartoes,qualidade;
	private Cartao cartoes;
	private String nome,apelido,condicao;
	private TipoDoJogador posicao;
	private LocalDate datadenascimento;
	private boolean suspenso;
	
	
	public Jogador() {
		
	}
	
	public Jogador(int id, String nome, String apelido, LocalDate datadenascimento, TipoDoJogador posicao, int numero_cartoes,Cartao cartoes, int qualidade) {
	
		this.id = id;
		this.nome = nome;
		this.apelido = apelido;
		this.datadenascimento = datadenascimento;
		this.posicao = posicao;
		this.numero_cartoes = numero_cartoes;
		this.cartoes = cartoes;
		this.qualidade = qualidade;
		
	}
	
	
	public void AplicarCartao(int qntd_cartoes, Cartao cor) {
		
		if(cor == Cartao.VERMELHO) {
			suspenso = true;
			if (numero_cartoes >= 1) {
				suspenso = true;
			}
			
			else {
				numero_cartoes += qntd_cartoes;
			}
		}
		
		else if(cor == Cartao.AMARELO){
			if(numero_cartoes >= 3) {
				suspenso = true;
			}
			
			else {
				numero_cartoes += qntd_cartoes;
			}
		}
	}
	
	
	
	public String Verificarcondicao() {
		
		if(suspenso == true) {
			condicao = "SUSPENSO";
		}
		
		else {
			condicao = "VAI JOGAR";
		}
		
		return condicao;
	}
	
	
	public void CumprirSuspensacao() {
		if (condicao == "SUSPENSO") {
			numero_cartoes = 0;
		}
		
		suspenso = false;
	}
	
	public void sofrerLesao() {
		
		Random aleatorio = new Random();
		double num_aleatorio = aleatorio.nextFloat() * 0.4;//40%
		
		if (num_aleatorio <= 0.05) {
			qualidade -= (qualidade *  0.15);
		} 
		
		else if(num_aleatorio <= 0.1) {
			qualidade -= (qualidade * 0.1);
		}
		
		else if(num_aleatorio <= 0.15) {
			qualidade -= (qualidade * 0.05);
		}
		
		else if(num_aleatorio <= 0.3 ) {
			qualidade -= 2;
		}
		
		else if(num_aleatorio <= 0.4) {
			qualidade -= 1;
		}
	}
	
	public void executarTreinamento() {
		Random aleatorio = new Random();
		double num_aleatorio2 = aleatorio.nextFloat() * 0.4;//40%
		
		if (num_aleatorio2 <= 0.05) {
			qualidade += 5;
		} 
		
		else if(num_aleatorio2 <= 0.1) {
			qualidade += 4;
		}
		
		else if(num_aleatorio2 <= 0.15) {
			qualidade += 3;
		}
		
		else if(num_aleatorio2 <= 0.3 ) {
			qualidade += 2;
		}
		
		else if(num_aleatorio2 <= 0.4) {
			qualidade += 1;
		}
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getNumero() {
		return qntd_cartoes;
	}
	public void setNumero(int qntd_cartoes) {
		this.qntd_cartoes = qntd_cartoes;
	}
	
	public Cartao getCartoes() {
		return cartoes;
	}
	public void setCartoes(Cartao cartoes) {
		this.cartoes = cartoes;
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
	
	public int getNumero_cartoes() {
		return numero_cartoes;
	}

	public void setNumero_cartoes(int numero_cartoes) {
		this.numero_cartoes = numero_cartoes;
	}

	public int getQualidade() {
		return qualidade;
	}

	public void setQualidade(int qualidade) {
		this.qualidade = qualidade;
	}

	public TipoDoJogador getPosicao() {
		return posicao;
	}
	public void setPosicao(TipoDoJogador posicao) {
		this.posicao = posicao;
	}
	
	public LocalDate getDatadenascimento() {
		return datadenascimento;
	}
	public void setDatadenascimento(LocalDate datadenascimento) {
		this.datadenascimento = datadenascimento;
	}
	
	public boolean isSuspenso() {
		return suspenso;
	}
	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	

}
