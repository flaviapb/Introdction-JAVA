package atividades;

import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroDosJogadores {

	public static void main(String[] args) {
		
		//Criando um arraylist
		ArrayList<Jogador> lista_jogadores = new ArrayList<Jogador>();
		
		//Instanciando e adicionando no meu array
		// Como a escala��o foi feita agora, ningu�m possui cart�o
		lista_jogadores.add(new Jogador(1,"Fellipe","Z� Gra�a", LocalDate.of(1987, 5, 2), TipoDoJogador.GOLEIRO,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(2,"Arthur","Veterano", LocalDate.of(1989, 3, 8), TipoDoJogador.LATERALDIREITO,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(3,"Vitor","Banheirista", LocalDate.of(2000, 1, 25), TipoDoJogador.VOLANTE,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(4,"Emanuel","Telespectador", LocalDate.of(1999, 2, 2), TipoDoJogador.MEIA,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(5,"Anderson","Chor�o", LocalDate.of(1998, 11, 2), TipoDoJogador.VOLANTE,2,Cartao.AMARELO,20));
		lista_jogadores.add(new Jogador(6,"Fl�vio","Gordinho", LocalDate.of(1786, 12, 25), TipoDoJogador.ATACANTE,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(7,"Junior","Atrasadinho", LocalDate.of(1969, 7, 14), TipoDoJogador.LATERALESQUERDO,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(8,"Deivdy","T�cnico", LocalDate.of(1899, 8, 23), TipoDoJogador.ZAGUEIRO,1,Cartao.AMARELO,20));
		lista_jogadores.add(new Jogador(9,"Yure","Goleir�o", LocalDate.of(2001, 10, 30), TipoDoJogador.GOLEIRO,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(10,"Rafael","Pared�o", LocalDate.of(1999, 2, 28), TipoDoJogador.VOLANTE,0,Cartao.SEMCARTAO,20));
		lista_jogadores.add(new Jogador(11,"Ryan","P�-de-Alface", LocalDate.of(1969, 12, 25), TipoDoJogador.ZAGUEIRO,0,Cartao.SEMCARTAO,20));
		
		JOptionPane.showMessageDialog(null, "Jogadores cadastrados/escalados!!!");
		
		System.out.println("\n------------------------------------JOGADORES ESCALADOS-----------------------------------------------------------\n");
		ImprimirJogadoresEscalados(lista_jogadores);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
		
		System.out.println("\n---------------------------------------JOGADORES QUE RECEBERAM CART�O----------------------------------------------");
		//Aplicando cart�o vermelho nos 2 primeiros jogadores
		for (int i = 0; i < 2; i++) {
			lista_jogadores.get(i).AplicarCartao(1, Cartao.VERMELHO);
			
			System.out.printf("\nJogador: " + lista_jogadores.get(i).getNome() + " recebeu um cart�o " + Cartao.VERMELHO);
		}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		
		System.out.println("\n---------------------------------------SITUA��O ATUAL DOS JOGADORES-----------------------------------------------\n");
		ImprimirJogadores(lista_jogadores);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");
		
		
		
		//Aplicando o comprimento da suspensa��o nos 2 primeiros jogadores
		for (int i = 0; i < 2; i++) {
			lista_jogadores.get(i).CumprirSuspensacao();
			
		}
		
		System.out.println("\n--------------------------SITUA��O ATUAL DOS JOGADORES DEPOIS DE CUMPRIR A SUSPEN��O-----------------------------\n");
		ImprimirJogadores(lista_jogadores);
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");

		
		System.out.println("\n---------------------------------------------JOGADOR COM LES�O--------------------------------------------------------");
		//Atribuindo les�o no indice 05
				for (int i = 5; i==5; i++) {
					lista_jogadores.get(i).sofrerLesao();
					System.out.println("\n O jogador "+ lista_jogadores.get(i).getNome() + " sofreu uma les�o, e est� com: " + 
										lista_jogadores.get(i).getQualidade() + " de qualidade.");
				}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");		

		
		System.out.println("\n---------------------------------------------JOGADOR TREINOU--------------------------------------------------------");
		//Atribuindo treinamento, j� que est� com les�o
				for (int i = 0; i<11; i++) {
					lista_jogadores.get(i).executarTreinamento();
					System.out.println("\n O jogador "+ lista_jogadores.get(i).getNome() + " participou do treinamento e sua qualidade subiu para: " +
										lista_jogadores.get(i).getQualidade());
				}
		System.out.println("\n--------------------------------------------------------------------------------------------------------------------");		

	}
	
	
	public static void ImprimirJogadoresEscalados(ArrayList<Jogador> lista_jogadores) {
		for(Jogador jogador : lista_jogadores) {
			System.out.println(jogador.getId() + "   " + jogador.getNome() + "   " + jogador.getApelido() + "   " +
					jogador.getDatadenascimento() + "   " + jogador.getPosicao() + "   " + jogador.getNumero_cartoes() + "  --> " + jogador.getCartoes() + "\n");
		}
	}
	
	public static void ImprimirJogadores(ArrayList<Jogador> lista_jogadores) {
		for(Jogador jogador : lista_jogadores) {
			System.out.println(jogador.getId() + "   " + jogador.getNome() + "   " + jogador.getApelido() + "   " +
					jogador.getDatadenascimento() + "   " +  "  --> " + jogador.Verificarcondicao() + "\n");
		}
	}
}
