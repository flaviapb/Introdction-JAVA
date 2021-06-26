package loopwhile;

import java.util.*;

public class NomeAlgumasVezesNaTela {
	
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		String nome;
		int num;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.println("Digite a quantidade de vezes para o nome aparecer na tela: ");
		num = input.nextInt();
		
		while (num > 0) {
			
			System.out.println(nome);
			
			num--;
		}

	}

}
