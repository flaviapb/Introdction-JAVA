package atividades;

import java.util.ArrayList;

public class TimePrincipal {

	public static void main(String[] args) {
		
		//CADASTRANDO JOGADORES BRASIL
		ArrayList<Jogadores> selecaoBrasil = new ArrayList<Jogadores>();
		selecaoBrasil.add(new Jogadores(1,"Marcos Roberto","Divino",TipoDoJogador.GOLEIRO, Selecao.BRASIL,120));
		selecaoBrasil.add(new Jogadores(2,"Marcos Evagelista","Cafú",TipoDoJogador.LATERALDIREITO, Selecao.BRASIL,100));
		selecaoBrasil.add(new Jogadores(3,"Lucimar da Silva","Imperador",TipoDoJogador.ZAGUEIRO, Selecao.BRASIL,123));
		selecaoBrasil.add(new Jogadores(4,"Roque Junior", "Queixada", TipoDoJogador.ZAGUEIRO,Selecao.BRASIL,119));
		selecaoBrasil.add(new Jogadores(5,"Edimilson","Bugre", TipoDoJogador.VOLANTE, Selecao.BRASIL,130));
		selecaoBrasil.add(new Jogadores(6,"Roberto Carlos", "Pitbull", TipoDoJogador.LATERALESQUERDO,Selecao.BRASIL,125));
		selecaoBrasil.add(new Jogadores(7,"Ricardo","Ricardinho",TipoDoJogador.MEIA,Selecao.BRASIL,132));
		selecaoBrasil.add(new Jogadores(8,"Gilberto Silva","Gil",TipoDoJogador.VOLANTE,Selecao.BRASIL,137));
		selecaoBrasil.add(new Jogadores(9,"Ronaldo","Ronaldo Fenômeno",TipoDoJogador.ATACANTE,Selecao.BRASIL,168));
		selecaoBrasil.add(new Jogadores(10,"Vitor Borba","Rivaldin",TipoDoJogador.ATACANTE,Selecao.BRASIL,138));
		selecaoBrasil.add(new Jogadores(11,"Ronaldinho","Ronaldinho Gaúcho",TipoDoJogador.MEIA,Selecao.BRASIL,150));
		selecaoBrasil.add(new Jogadores(12,"Nelson de Jesus","Dida",TipoDoJogador.GOLEIRO,Selecao.BRASIL,137));
		selecaoBrasil.add(new Jogadores(13,"Juliano Haus","Belleti",TipoDoJogador.LATERALDIREITO,Selecao.BRASIL,125));
		selecaoBrasil.add(new Jogadores(14,"Anderson","Polga",TipoDoJogador.ZAGUEIRO,Selecao.BRASIL,131));
		selecaoBrasil.add(new Jogadores(15,"Kléberson","General",TipoDoJogador.VOLANTE,Selecao.BRASIL,110));
		selecaoBrasil.add(new Jogadores(16,"Jenilson JUnior","Nagatta",TipoDoJogador.LATERALESQUERDO,Selecao.BRASIL,136));
		selecaoBrasil.add(new Jogadores(17,"Denilson Araujo","Denilson Show",TipoDoJogador.MEIA,Selecao.BRASIL,156));
		selecaoBrasil.add(new Jogadores(18,"Marcos André","Vampeta",TipoDoJogador.VOLANTE,Selecao.BRASIL,155));
		selecaoBrasil.add(new Jogadores(19,"Oswaldo","Juninho",TipoDoJogador.MEIA,Selecao.BRASIL,159));
		selecaoBrasil.add(new Jogadores(20,"Edilson Da Silva","Edilson Capetinha",TipoDoJogador.ATACANTE,Selecao.BRASIL,155));
		selecaoBrasil.add(new Jogadores(21,"Luiz Carlos","Luizão",TipoDoJogador.ATACANTE,Selecao.BRASIL,134));
		selecaoBrasil.add(new Jogadores(22,"Rogerio Mucke","Rogerio Ceni", TipoDoJogador.GOLEIRO,Selecao.BRASIL,159));
		selecaoBrasil.add(new Jogadores(23,"Ricardo Leite","Kaka",TipoDoJogador.MEIA,Selecao.BRASIL,160));
		
		//CADASTRANDO TIME BRASIL
		TimeFutebol brasil = new TimeFutebol(Selecao.BRASIL, "07/07/1822", selecaoBrasil);
		
		//CADASTRANDO JOGADORES FLAMENGO
		ArrayList<Jogadores> selecaoFlamengo = new ArrayList<Jogadores>();
		selecaoFlamengo.add(new Jogadores(1,"Giorgian","Arrascaeta",TipoDoJogador.MEIA,Selecao.FLAMENGO,162));
		selecaoFlamengo.add(new Jogadores(2, "Gabriel Barbosa","Gabigol",TipoDoJogador.ATACANTE,Selecao.FLAMENGO,160));
		selecaoFlamengo.add(new Jogadores(3, "Pedro Abreu", "Bom de bola",TipoDoJogador.ATACANTE,Selecao.FLAMENGO,145));
		selecaoFlamengo.add(new Jogadores(4, "Victor Coelho", "Vitinho", TipoDoJogador.ATACANTE, Selecao.FLAMENGO,146));
		selecaoFlamengo.add(new Jogadores(5, "Everton Ribeiro", "Rapidin",TipoDoJogador.MEIA, Selecao.FLAMENGO,162));
		selecaoFlamengo.add(new Jogadores(6, "Bruno Henrique", "Brunin", TipoDoJogador.ATACANTE,Selecao.FLAMENGO,163));
		selecaoFlamengo.add(new Jogadores(7, "Willian", "Arão", TipoDoJogador.MEIA, Selecao.FLAMENGO,135));
		selecaoFlamengo.add(new Jogadores(8, "Diego Alves", "Pegador",TipoDoJogador.GOLEIRO, Selecao.FLAMENGO,167));
		selecaoFlamengo.add(new Jogadores(9, "Rodrigo Caio", "Muralha", TipoDoJogador.LATERALDIREITO, Selecao.FLAMENGO,150));
		selecaoFlamengo.add(new Jogadores(10,"Rodinei","Flash",TipoDoJogador.LATERALESQUERDO, Selecao.FLAMENGO,151));
		selecaoFlamengo.add(new Jogadores(11,"Yuri","Pantera Negra",TipoDoJogador.LATERALDIREITO, Selecao.FLAMENGO,130));
		selecaoFlamengo.add(new Jogadores(12,"Hugo Moura","Tino",TipoDoJogador.GOLEIRO, Selecao.FLAMENGO,131));
		selecaoFlamengo.add(new Jogadores(13,"Thiago Maia","Rei de Roma",TipoDoJogador.VOLANTE, Selecao.FLAMENGO,120));
		selecaoFlamengo.add(new Jogadores(14,"João Gomes","Caça-Rato",TipoDoJogador.ZAGUEIRO, Selecao.FLAMENGO,118));
		selecaoFlamengo.add(new Jogadores(15,"Daniel Cabral","Caixa",TipoDoJogador.LATERALDIREITO, Selecao.FLAMENGO,110));
		selecaoFlamengo.add(new Jogadores(16,"Mauricio","Isla",TipoDoJogador.ZAGUEIRO, Selecao.FLAMENGO,161));
		selecaoFlamengo.add(new Jogadores(17,"Luan Sales","Professor",TipoDoJogador.MEIA, Selecao.FLAMENGO,118));
		selecaoFlamengo.add(new Jogadores(18,"Bruno Viana","Ceifador",TipoDoJogador.VOLANTE,Selecao.FLAMENGO,153));
		selecaoFlamengo.add(new Jogadores(19,"Rodirgo Muniz","Messias",TipoDoJogador.LATERALDIREITO, Selecao.FLAMENGO,128));
		selecaoFlamengo.add(new Jogadores(20,"Matheus Lima","Profeta",TipoDoJogador.LATERALESQUERDO, Selecao.FLAMENGO,157));
		selecaoFlamengo.add(new Jogadores(21,"Thiago Sila","Brocador",TipoDoJogador.VOLANTE, Selecao.FLAMENGO,152));
		selecaoFlamengo.add(new Jogadores(22,"Vitor Gabriel","Capacete",TipoDoJogador.ZAGUEIRO, Selecao.FLAMENGO,159));
		selecaoFlamengo.add(new Jogadores(23,"Michael Delgado","Foquinha",TipoDoJogador.MEIA, Selecao.FLAMENGO,150));

		//CADASTRANDO TIME FLAMENGO
		TimeFutebol flamengo = new TimeFutebol(Selecao.FLAMENGO, "17/11/1895", selecaoFlamengo);
		
		flamengo.relacionarJogadores(selecaoFlamengo);
		
		System.out.println("----------------------------Seleção Brasil------------------------------------");
		for(Jogadores jogador : selecaoBrasil) {
			System.out.println(jogador.getId() + "   " + jogador.getNome() + "   " + jogador.getApelido() +
					"   " + jogador.getPosicao() + "  " + jogador.getNomeselecao() + "  " + jogador.getQualidade() + "\n");
		}
		
		System.out.println("\n----------------------------Seleção Flamengo------------------------------------");
		for(Jogadores jogador2 : selecaoFlamengo) {
			System.out.println(jogador2.getId() + "   " + jogador2.getNome() + "   " + jogador2.getApelido() +
					"   " + jogador2.getPosicao() + "  " + jogador2.getNomeselecao() + "  " + jogador2.getQualidade() + "\n");
		}
		
		
	}

}
