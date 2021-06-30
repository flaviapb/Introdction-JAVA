package atividades;

/*
 * @author FláviaRenata
 * 
 * */

import java.util.*;

public class CamisaPrincipal {
	
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String nome; // nome do cliente
		String corescolha; //cor escolhida da camisa
		String tipoescolha; //tipo escolhida da camissa
		
		Camisa camisaescolhida = new Camisa();
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		System.out.printf("\nOlá %s. Segue os modelos disponiveis para o dia de hoje:\n"
				+ "\nPolo \n"
				+ "Basica\n"
				+ "Estampada\n",nome);
		
		System.out.printf("\nDigite o tipo da sua camisa %s\n", nome);
		tipoescolha = input.next().toLowerCase();
		
		if (tipoescolha.equals("polo")) {
			
			System.out.println("\nCores Disponiveis: \n"
					+ "\nAzul claro\n"
					+ "Preto\n"
					+ "Branco\n");
			
			camisaescolhida.setpreco(35.90);
			
		} else if (tipoescolha.equals("basica"))  {
			
			System.out.println("\nCores Disponiveis: \n"
					+ "\nVerde\n"
					+ "Preto\n"
					+ "Branco\n"
					+ "Vermelho\n");
			
			camisaescolhida.setpreco(55.90);

		} else if (tipoescolha.equals("estampada"))  {
			
			System.out.println("\nCores Disponiveis: \n"
					+ "\nVerde\n"
					+ "Preto\n"
					+ "Branco\n"
					+ "Vermelho\n"
					+ "Rosa\n");
			
			camisaescolhida.setpreco(65.80);
		}

		
		System.out.printf("\nDigite a cor da sua camisa, %s: \n",nome);
		corescolha = input.next();
		
		camisaescolhida.setcor(corescolha);
		camisaescolhida.setnome(nome);
		camisaescolhida.settipo(tipoescolha);
		
		camisaescolhida.Exibir();

	}

}
