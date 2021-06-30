package atividades;

/*
 * @author FláviaRenata
 * 
 * */

import java.util.*;

public class CarroPrincipal {
	
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String nome;
		String marca;
		String cor;
		String buzinar;
		double preco;
		
		Carro carroescolhido = new Carro();
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		
		carroescolhido.setpropietario(nome);
		
		System.out.printf("\nDigite a marca do seu carro, senhor(a) %s: \n",nome);
		marca = input.next();

		carroescolhido.setmarca(marca);
		
		System.out.printf("\nDigite a cor do seu carro, senhor(a) %s: \n",nome);
		cor = input.next();
		
		carroescolhido.setcor(cor);
		
		System.out.printf("\nDigite o valor do seu carro, senhor(a) %s: \n",nome);
		preco = input.nextDouble();
		
		carroescolhido.setvalor(preco);
		
		System.out.printf("\nDeseja testar a buzina do seu carro, senhor(a) %s: \n",nome);
		buzinar = input.next().toLowerCase();
		
		if (buzinar.equals("sim")) {
			
			carroescolhido.setbuzinando(true);
			
		} else if(buzinar.equals("não") || buzinar.equals("nao")) {
			
			carroescolhido.setbuzinando(false);
		}
		
		carroescolhido.Buzinar();
		carroescolhido.Exibir();
	}

}
