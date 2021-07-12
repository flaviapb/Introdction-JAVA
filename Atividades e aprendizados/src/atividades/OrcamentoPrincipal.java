package atividades;

import java.util.*;
import javax.swing.JOptionPane;

public class OrcamentoPrincipal {

	private static Scanner input;
	public static void main(String[] args) {
		
		String qntfinal,nomeproduto,qualproduto;
		int qntdfinal, vezesDeProcura;
		float valorproduto;
		
		input = new Scanner(System.in);
		
		qntfinal = JOptionPane.showInputDialog(null, "Quantos produtos você quer adicionar? ");
		qntdfinal = Integer.parseInt(qntfinal);
		
		ItemOrcamento[] itens = new ItemOrcamento[qntdfinal];
		
		for (int i = 0; i < itens.length; i++) {
			
			System.out.print("\nDigite o nome do produto: ");
			nomeproduto = input.next();
			System.out.printf("\nDigite o valor do %s: ",nomeproduto);
			valorproduto = input.nextFloat();
			
			itens[i] = new ItemOrcamento(nomeproduto, valorproduto);
			
			ItemOrcamentoComplexo tratarItens = new ItemOrcamentoComplexo(nomeproduto, valorproduto, itens);
			
			tratarItens.encontrarItem(nomeproduto);
			
		}
		
	
	}

}
