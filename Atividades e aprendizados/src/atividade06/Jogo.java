package atividade06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Jogo extends Time {

	private String cidade,estado;
	private ArrayList<Time> mandante, visitante;
	private LocalDate datadojgo;
	private int placarMandante,placarVisitante;
	private int qualidadeTotal;
	
	
	public Jogo() {
		
	}
	
	public Jogo(String cidade, String estado, ArrayList<Time> mandante, ArrayList<Time> visitante, 
			LocalDate datadojogo, int placarMandante, int placarVisitante) {
		this.cidade = cidade;
		this.estado = estado;
		this.mandante = mandante;
		this.visitante = visitante;
		this.datadojgo = datadojogo;
		this.placarMandante = placarMandante;
		this.placarVisitante = placarVisitante;
	}
	
	
	
	public void gerarResultados(ArrayList<Time> mandante, ArrayList<Time> visitante) {
		int somaMandante = 0;
		for (int i = 0; i < mandante.size(); i++) {
			if (mandante.get(i).getTipoJogador() != TitularOuReserva.RESERVA) {
				somaMandante += mandante.get(i).getQualidade();
			}
		}
		
		int somaVisitante = 0;
		for (int j = 0; j < visitante.size(); j++) {
			if (visitante.get(j).getTipoJogador() != TitularOuReserva.RESERVA) {
				somaVisitante += visitante.get(j).getQualidade();
			}
		}
		
		
		if (somaMandante > somaVisitante) {
			System.out.printf("\n		Mandante venceu com uma diferença de %d pontos. \n",somaMandante-somaVisitante);
			placarMandante += 1;
		}  
		
		else {
			System.out.printf("\n		Visitante venceu com uma diferença de %d pontos. \n",somaVisitante-somaMandante);
			placarVisitante += 1;
		}
		
		System.out.print("\n			PONTOS DO TIME MANDANTE: "+ placarMandante);
		System.out.print("\n			PONTOS DO TIME VISITANTE "+ placarVisitante + "\n");

	}
	
	public void gerarLesoes(ArrayList<Time> time) {
		
		Random aleatorio = new Random();
		int num_aleatorio = aleatorio.nextInt(500); //Lesão até 500
		int jogadorescolhido = aleatorio.nextInt(23); //pelo ID dos jogadores
		
		if (time == mandante) {
			System.out.printf("\n		O jogador com Id %d, do time mandante, sofreu %d de dano.\n",jogadorescolhido,num_aleatorio);
		}
		
		else {
			System.out.printf("\n		O jogador com Id %d, do time visitante, sofreu %d de dano.\n",jogadorescolhido,num_aleatorio);
		}
	}
	
	
	public void gerarCartoes(ArrayList<Time> time) { 
		
		Random aleatorio = new Random();
		int jogadorCartao = aleatorio.nextInt(23); //PELO ID
		int corCartao = aleatorio.nextInt(3);
		
		if (time == mandante) {
			if(corCartao == 1 || corCartao == 0) {
				System.out.printf("\n	O jogador com ID %d, do time mandante recebeu um cartão amarelo: \n",jogadorCartao);
			}
			else if(corCartao == 2) {
				System.out.printf("\n	O jogador com ID %d, do time mandante recebeu um cartão vermelho: \n",jogadorCartao);
			}
		}
		
		else {
			if(corCartao == 1 || corCartao == 0) {
				System.out.printf("\n	O jogador com ID %d, do time visitante recebeu um cartão amarelo: \n",jogadorCartao);
			}
			else if(corCartao == 2) {
				System.out.printf("\n	O jogador com ID %d, do time visitante recebeu um cartão vermelho: \n",jogadorCartao);
			}
		}
	}
	
	public String permitirTreinamento(String resposta) {
		
		if (resposta.equals("SIM")) {
			return "O TIME VAI SER TREINADO :)";
		}
		
		else {
			return "O TIME NÃO VAI SER TREINADO :( ";
		}
		
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<Time> getMandante() {
		return mandante;
	}

	public void setMandante(ArrayList<Time> mandante) {
		this.mandante = mandante;
	}

	public ArrayList<Time> getVisitante() {
		return visitante;
	}

	public void setVisitante(ArrayList<Time> visitante) {
		this.visitante = visitante;
	}

	public LocalDate getDatadojgo() {
		return datadojgo;
	}

	public void setDatadojgo(LocalDate datadojgo) {
		this.datadojgo = datadojgo;
	}

	public Integer getPlacarMandante() {
		return placarMandante;
	}

	public void setPlacarMandante(Integer placarMandante) {
		this.placarMandante = placarMandante;
	}

	public Integer getPlacarVisitante() {
		return placarVisitante;
	}

	public void setPlacarVisitante(Integer placarVisitante) {
		this.placarVisitante = placarVisitante;
	}

	public int getQualidadeTotal() {
		return qualidadeTotal;
	}

	public void setQualidadeTotal(int qualidadeTotal) {
		this.qualidadeTotal = qualidadeTotal;
	}
	
	
}
