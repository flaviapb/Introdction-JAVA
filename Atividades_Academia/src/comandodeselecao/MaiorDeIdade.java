package comandodeselecao;

import java.util.*;

public class MaiorDeIdade {
	
	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = input.next();
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		if (idade >= 18) {
			
			System.out.printf("Olá %s, você tem %d anos, por isso é maior de idade!", nome,idade);
			
		} else {
			
			System.out.printf("Olá %s, você tem %d anos, por isso é menor de idade!", nome,idade);

		}

	}

}
