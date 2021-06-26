package loopdowhile;

import java.util.*;

public class VerificarOpcao {

	private static Scanner input;
	public static void main(String[] args) {
			
		input = new Scanner(System.in);
	    
	    int opcao = 0;

	    do {
	      System.out.println("Escolha uma opcao:");
	      System.out.println("1 - Iniciar jogo");
	      System.out.println("2 - Ajuda");
	      System.out.println("3 - Sair");
	      System.out.println("OPCAO: ");
	      opcao = input.nextInt();
	    } while (opcao != 3);
	    
	    System.out.println("Tchauzinho!");

	}

}
