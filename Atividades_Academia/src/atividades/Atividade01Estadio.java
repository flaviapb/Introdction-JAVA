package atividades;

import java.util.*;

public class Atividade01Estadio {
	
	private static Scanner input;
	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		final int A = 50; int B = 30; int C = 20;
		int classeA, classeB, classeC,qntd_vendidos;
		
		System.out.println("Quantos bilhetes foram vendidos da classe A? ");
		classeA = input.nextInt();
		
		System.out.println("Quantos bilhetes foram vendidos da classe B? ");
		classeB = input.nextInt();
		
		System.out.println("Quantos bilhetes foram vendidos da classe C? ");
		classeC = input.nextInt();
		
		qntd_vendidos = ((classeA * A) + (classeB * B) + (classeC * C));
		
		System.out.printf("A quantidade de bilhetes vendidos da Classe A: %d\n"
				+ "A quantidade de bilhetes vendidos da Classe B: %d\n"
				+ "A quantidade de bilhetes vendidos da Classe C: %d\n"
				+ "E o total resgatado das vendas dos bilhetes foram: %d$", classeA,classeB,classeC,qntd_vendidos);
		

	}

}
