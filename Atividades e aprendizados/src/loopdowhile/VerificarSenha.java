package loopdowhile;

import java.util.*;

public class VerificarSenha {
	
	private static Scanner input;
	public static void main(String[] args) {

		input = new Scanner(System.in);
		String senha,confirmasenha;
		
		System.out.println("Digite sua senha: ");
		senha = input.next();
		
		
		do {
			
			System.out.println("Confirme sua senha: ");
			confirmasenha = input.next();
			
			if(!senha.equals(confirmasenha)) {
				System.out.println("Senha Incorreta!");
			}
			
		} while (!senha.equals(confirmasenha));

		System.out.println("Cadastro Aprovado!!!!");
	}
}
