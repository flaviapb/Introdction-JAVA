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

		System.out.println("\n-------------------------------Cadastro dos produtos-------------------------------------\n");

		for (int i = 0; i < qntdfinal; i++) {
			
			System.out.print("\nDigite o nome do produto: ");
			nomeproduto = input.next();
			System.out.printf("\nDigite o valor do %s: ",nomeproduto);
			valorproduto = input.nextFloat();
			
			listageral.add(new ItemOrcamento(nomeproduto, valorproduto));				
		}
		
		System.out.println("\n----------------------------------------------------------------------------------------\n");

		ItemOrcamentoComplexo item = new ItemOrcamentoComplexo(listageral);
		
		System.out.println("\n------------------------------------Soma total------------------------------------------\n");
		
		System.out.println("A soma de todos os produtos cadastrados: " + item.getValor());
		
		System.out.println("\n----------------------------------------------------------------------------------------\n");

		String procurar,vezes;
		int vezesPesquisar;
	
		vezes = JOptionPane.showInputDialog("Digite quantos produtos você quer procurar: ");
		vezesPesquisar = Integer.parseInt(vezes);
		
		System.out.println("\n------------------------------------Procurar na lista-------------------------------------\n");
		
		for (int i = 0; i < vezesPesquisar; i++) {
			System.out.print("\nDigite o nome do produto: ");
			procurar = input.next();
			
			System.out.print(item.encontreItem(procurar)+"\n");
		}
		
		System.out.println("\n----------------------------------------------------------------------------------------\n");
		
	
		
	}
}
