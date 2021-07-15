package atividade06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class CadastrandoTimes {
	public static void main(String[] args) {
		
		//Cadastrando Jogadores do time MANDANTE
		ArrayList<Time> mandante = new ArrayList<Time>();		
		mandante.add(new Time(1,"Marcos Roberto","Divino",TitularOuReserva.RESERVA,120));
		mandante.add(new Time(2,"Marcos Evagelista","Cafú",TitularOuReserva.RESERVA,100));
		mandante.add(new Time(3,"Lucimar da Silva","Imperador",TitularOuReserva.RESERVA,123));
		mandante.add(new Time(4,"Roque Junior", "Queixada",TitularOuReserva.TITULAR,119));
		mandante.add(new Time(5,"Edimilson","Bugre",TitularOuReserva.RESERVA,130));
		mandante.add(new Time(6,"Roberto Carlos", "Pitbull",TitularOuReserva.TITULAR,125));
		mandante.add(new Time(7,"Ricardo","Ricardinho",TitularOuReserva.TITULAR,132));
		mandante.add(new Time(8,"Gilberto Silva","Gil",TitularOuReserva.TITULAR,137));
		mandante.add(new Time(9,"Ronaldo","Ronaldo Fenômeno",TitularOuReserva.TITULAR,168));
		mandante.add(new Time(10,"Vitor Borba","Rivaldin",TitularOuReserva.TITULAR,138));
		mandante.add(new Time(11,"Ronaldinho","Ronaldinho Gaúcho",TitularOuReserva.TITULAR,150));
		mandante.add(new Time(12,"Nelson de Jesus","Dida",TitularOuReserva.TITULAR,137));
		mandante.add(new Time(13,"Juliano Haus","Belleti",TitularOuReserva.RESERVA,125));
		mandante.add(new Time(14,"Anderson","Polga",TitularOuReserva.TITULAR,131));
		mandante.add(new Time(15,"Kléberson","General",TitularOuReserva.TITULAR,110));
		mandante.add(new Time(16,"Jenilson JUnior","Nagatta",TitularOuReserva.TITULAR,136));
		mandante.add(new Time(17,"Denilson Araujo","Denilson Show",TitularOuReserva.RESERVA,156));
		mandante.add(new Time(18,"Marcos André","Vampeta",TitularOuReserva.RESERVA,155));
		mandante.add(new Time(19,"Oswaldo","Juninho",TitularOuReserva.TITULAR,159));
		mandante.add(new Time(20,"Edilson Da Silva","Edilson Capetinha",TitularOuReserva.RESERVA,155));
		mandante.add(new Time(21,"Luiz Carlos","Luizão",TitularOuReserva.RESERVA,134));
		mandante.add(new Time(22,"Rogerio Mucke","Rogerio Ceni",TitularOuReserva.RESERVA,159));
		mandante.add(new Time(23,"Ricardo Leite","Kaka",TitularOuReserva.TITULAR,160));
		
		//Cadastrando Jogadores do time VISITANTE
		ArrayList<Time> visitante = new ArrayList<Time>();
		visitante.add(new Time(1,"Giorgian","Arrascaeta",TitularOuReserva.TITULAR,162));
		visitante.add(new Time(2, "Gabriel Barbosa","Gabigol",TitularOuReserva.TITULAR,160));
		visitante.add(new Time(3, "Pedro Abreu", "Bom de bola",TitularOuReserva.TITULAR,145));
		visitante.add(new Time(4, "Victor Coelho", "Vitinho",TitularOuReserva.TITULAR,146));
		visitante.add(new Time(5, "Everton Ribeiro", "Rapidin",TitularOuReserva.TITULAR,162));
		visitante.add(new Time(6, "Bruno Henrique", "Brunin",TitularOuReserva.TITULAR,163));
		visitante.add(new Time(7, "Willian", "Arão",TitularOuReserva.TITULAR,135));
		visitante.add(new Time(8, "Diego Alves", "Pegador",TitularOuReserva.TITULAR,167));
		visitante.add(new Time(9, "Rodrigo Caio", "Muralha",TitularOuReserva.TITULAR,150));
		visitante.add(new Time(10,"Rodinei","Flash",TitularOuReserva.TITULAR,151));
		visitante.add(new Time(11,"Yuri","Pantera Negra",TitularOuReserva.RESERVA,130));
		visitante.add(new Time(12,"Hugo Moura","Tino",TitularOuReserva.RESERVA,131));
		visitante.add(new Time(13,"Thiago Maia","Rei de Roma",TitularOuReserva.RESERVA,120));
		visitante.add(new Time(14,"João Gomes","Caça-Rato",TitularOuReserva.RESERVA,118));
		visitante.add(new Time(15,"Daniel Cabral","Caixa",TitularOuReserva.TITULAR,110));
		visitante.add(new Time(16,"Mauricio","Isla",TitularOuReserva.RESERVA,161));
		visitante.add(new Time(17,"Luan Sales","Professor",TitularOuReserva.RESERVA,118));
		visitante.add(new Time(18,"Bruno Viana","Ceifador",TitularOuReserva.TITULAR,153));
		visitante.add(new Time(19,"Rodirgo Muniz","Messias",TitularOuReserva.RESERVA,128));
		visitante.add(new Time(20,"Matheus Lima","Profeta",TitularOuReserva.RESERVA,157));
		visitante.add(new Time(21,"Thiago Sila","Brocador",TitularOuReserva.TITULAR,152));
		visitante.add(new Time(22,"Vitor Gabriel","Capacete",TitularOuReserva.RESERVA,159));
		visitante.add(new Time(23,"Michael Delgado","Foquinha",TitularOuReserva.RESERVA,150));
		
		//INSTANCIADO OS DADOS SOBRE 0 TIME
		Jogo detalhesJogo = new Jogo("Campina Grande", "PB", mandante, visitante, LocalDate.of(2021, 5, 2),3,4);
	
		
		//PONTOS(PLACAR) QUE CADA TIME ESTAVA, ANTES DESSE JOGO
		System.out.print("---------------------------------PLACAR INICIAL--------------------------------------------------------\n");
		System.out.print("\n			   PONTOS DO TIME MANDANTE : "+ detalhesJogo.getPlacarMandante() + "\n");
		System.out.print("\n			   PONTOS DO TIME VISITANTE : "+ detalhesJogo.getPlacarVisitante() + "\n");
		System.out.print("---------------------------------------------------------------------------------------------------------\n");
		
		//INTERAGINDO COM O USUÁRIO
		JOptionPane.showMessageDialog(null, "PIIIII, JOGO COMEÇOU!");
		JOptionPane.showMessageDialog(null, "PIIIII, JOGO PARADO, LESÕES NA ÁREA!");
		
		
		//MOSTRANDO 2 LESÕES DE FORMA ALEATORIA
		System.out.print("\n------------------------LESÕES QUE OCORRERAM NO DECORRER DO JOGO----------------------------------------\n");
		
		for (int i = 0; i < 2; i++) {
			Random aleatorio = new Random();	
			int escolhatime = aleatorio.nextInt(2);
			
			if (escolhatime == 1) {
				detalhesJogo.gerarLesoes(mandante);
			}
			
			else {
				detalhesJogo.gerarLesoes(visitante);
			}

		}
		System.out.print("\n---------------------------------------------------------------------------------------------------------\n");
		
		//INTERAGINDO COM O USUÁRIO
		JOptionPane.showMessageDialog(null, "PIIIII, JOGO RETOMADO, CUIDADO COM OS CARTÕES!!!!!");
		JOptionPane.showMessageDialog(null, "PIIIII, JOGO PARADO, OLHA OS CARTÕES!!!!!");
		
		//MOSTRANDO 10 CARTÕES COM CORES ALEATORIAS E PARA JOGADORES ALEATORIOS
		System.out.print("\n------------------------------------CARTÕES APLICADOS--------------------------------------------------------\n");
		for (int i = 0; i < 10; i++) {
			Random aleatorio = new Random();	
			int escolhatime = aleatorio.nextInt(2);
			
			if (escolhatime == 1) {
				detalhesJogo.gerarCartoes(visitante);
			}
			
			else {
				detalhesJogo.gerarCartoes(mandante);
			}
		}
		
		System.out.print("\n--------------------------------------------------------------------------------------------------------------\n");
		
		//APLICAR OU NÃO O TREINAMENTO
		System.out.print("\n-----------------------------------VAMOS TREINAR??-----------------------------------------------------------\n");
		String respostaTecnico1, respostaTecnico2;
		respostaTecnico1 = JOptionPane.showInputDialog("OLÁ TÉCNICO, VOCÊ VAI QUERER TREINAR SEU TIME(MANDANTE)? ").toUpperCase();
		respostaTecnico2 = JOptionPane.showInputDialog("OLÁ TÉCNICO, VOCÊ VAI QUERER TREINAR SEU TIME(VISITANTE)? ").toUpperCase();
		System.out.println("\n			MANDANTE --> "+detalhesJogo.permitirTreinamento(respostaTecnico1));
		System.out.println("\n			VISITANTE --> "+detalhesJogo.permitirTreinamento(respostaTecnico2));
		System.out.print("\n-----------------------------------------------------------------------------------------------------------------\n");
		
		//PONTOS(PLACAR) QUE CADA TIME ESTAVA, DEPOIS DESSE JOGO
		System.out.print("---------------------------------PLACAR FINAL--------------------------------------------------------\n");
		 detalhesJogo.gerarResultados(mandante,visitante);
		System.out.print("---------------------------------------------------------------------------------------------------------\n");
		
		//INTERAGINDO COM O USUÁRIO
		JOptionPane.showMessageDialog(null, "PIIIII, JOGO FINALIZADO :) !!!!!");
	}
}
