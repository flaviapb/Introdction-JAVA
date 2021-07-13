package atividades;
import java.util.*;
import javax.swing.JOptionPane;

public class OrcamentoPrincipal {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);

		ArrayList<ItemOrcamento> listageral = new ArrayList<ItemOrcamento>();
		
		String qntfinal,nomeproduto;
		int qntdfinal;
		float valorproduto;

		
		qntfinal = JOptionPane.showInputDialog(null, "Quantos produtos você quer adicionar? ");
		qntdfinal = Integer.parseInt(qntfinal);


		for (int i = 0; i < qntdfinal; i++) {
			
			System.out.print("\nDigite o nome do produto: ");
			nomeproduto = input.next();
			System.out.printf("\nDigite o valor do %s: ",nomeproduto);
			valorproduto = input.nextFloat();
			
			listageral.add(new ItemOrcamento(nomeproduto, valorproduto));				
		}
		
		
		ItemOrcamentoComplexo item = new ItemOrcamentoComplexo(listageral);
		
		System.out.println(item.getValor());
		
		String procurar;
	
		System.out.print("\nDigite o nome do produto: ");
		procurar = input.next();
		System.out.println(item.encontreItem(procurar));
		
		
		

		
		


		
		
	}
}
