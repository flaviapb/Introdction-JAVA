package atividades;

import java.util.*;

public class AtividadeXadrez02 {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		// Tabela para usu�rio saber quais pe�as est�o no tabuleiro
		System.out.println( );
		System.out.println("Ol� usu�rio, aqui est� a descri��o das pe�as destribuidas no tabuleiro:\n"
				+ "T --> TORRE\n"
				+ "C --> CAVALO\n"
				+ "B --> BISPO\n"
				+ "D --> DAMA\n"
				+ "R --> REI\n"
				+ "P ==> PEAO");
		System.out.println( );
			
		// MONTANDO O TABULEIRO
		String[][] tabuleiro = {
				{" ","-------------------"},
				{"1","|","T","C","B","D","R","B","C","T","|"},
				{"2","|","P","P","P","P","P","P","P","P","|"},
				{"3","|"," "," "," "," "," "," "," "," ","|"},
				{"4","|"," "," "," "," "," "," "," "," ","|"},
				{"5","|"," "," "," "," "," "," "," "," ","|"},
				{"6","|"," "," "," "," "," "," "," "," ","|"},
				{"7","|","P","P","P","P","P","P","P","P","|"},
				{"8","|","T","C","B","D","R","B","C","T","|"},
				{" ","-------------------"},
				{" "," ","2","3","4","5","6","7","8","9"}};

		// IMPRIMINDO O TABULEIRO SEM MOVIMENTA��O ALGUMA
		imprimirTabuleiro(tabuleiro);
		
		System.out.println();
		
		// Tipando minhas variaveis 
		int jogadax = 0,jogaday =0,positionBispoX = 0,positionBispoY=0;
		// Dicas de onde est�o localizados os bispos
		System.out.println("DIQUINHAS/AVISOS: :)\n"
				+ "\nPosi��es dos bispos: \n"
				+ "     [L][C]\n"
				+ " --> [1][4]\n"
				+ " --> [1][7]\n"
				+ " --> [8][4]\n"
				+ " --> [8][7]\n"
				+"\nL refere-se as LINHAS --> 1 at� 8\n"
				+ "C refere-se as COLUNA --> 2 at� 9\n"
				+ "Escolha entre eles, e mova seu bispo!!");
		System.out.println();
		
		
		// Pegando do usu�rio qual Bispo vai ser tratado
		System.out.println("Qual a posi��o L(LINHA) do seu bispo? ");
		positionBispoX = input.nextInt();
		System.out.println("Qual a posi��o C(COLUNA) do seu bispo? ");
		positionBispoY = input.nextInt();
		System.out.println();
		
		
		// Tratando cada bispo

		// Trabalhando com o bispo 1-4
		if (positionBispoX == 1 & positionBispoY == 4) {
			// Mostrando os pe�es que precissam ser movidos para mover o bispo
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos n�o podem pular nenhuma outra pe�a.\n"
					+ "Ent�o vamos movimentar o pe�o escolhido para baixo, para voc� poder mover o Bispo\n");
			
			// Movendo os pe�es necessarios pela escolha do bispo dele
			
			// Tratando o peao 2-3
			tabuleiro[3][3] = tabuleiro[2][3];
			tabuleiro[2][3] = " ";
				
			// tratatando o peao 2-5	
			tabuleiro[3][5] = tabuleiro[2][5];
			tabuleiro[2][5] = " ";
				
			// Imprimindo o tabuleiro com as movimenta��es dos pe�es
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usu�rio pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Voc� vai poder mover apenas uma vez\n"
						+ "Suas op��es de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [2][3]\n"
						+ "--> [3][2]\n"
						+ "Suas op��es de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [2][5]\n"
						+ "--> [3][6]\n"
						+ "--> [4][7]\n"
						+ "--> [5][8]\n"
						+ "--> [6][9]\n");
						
			System.out.println();
				
			// Aqui vai ser resgatado a op��o que o usu�rio escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimenta��o do bispo escolhido pelo usu�rio
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 1-7
		if (positionBispoX == 1 & positionBispoY == 7) {
			// Mostrando os pe�es que precissam ser movidos para mover o bispo
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos n�o podem pular nenhuma outra pe�a.\n"
					+ "Ent�o vamos movimentar o pe�o escolhido para baixo, para voc� poder mover o Bispo\n");
			
			// Movendo os pe�es necessarios pela escolha do bispo dele
			
			// Tratando o peao 3-8
			tabuleiro[3][8] = tabuleiro[2][8];
			tabuleiro[2][8] = " ";
				
			// tratatando o peao 3-6	
			tabuleiro[3][6] = tabuleiro[2][6];
			tabuleiro[2][6] = " ";
				
			// Imprimindo o tabuleiro com as movimenta��es dos pe�es
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usu�rio pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Voc� vai poder mover apenas uma vez\n"
						+ "Suas op��es de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [2][8]\n"
						+ "--> [3][9]\n"
						+ "Suas op��es de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [2][6]\n"
						+ "--> [3][5]\n"
						+ "--> [4][4]\n"
						+ "--> [5][3]\n"
						+ "--> [6][2]\n");
						
			System.out.println();
				
			// Aqui vai ser resgatado a op��o que o usu�rio escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimenta��o do bispo escolhido pelo usu�rio
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 8-4
		if (positionBispoX == 8 & positionBispoY == 4) {
			// Mostrando os pe�es que precissam ser movidos para mover o bispo
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos n�o podem pular nenhuma outra pe�a.\n"
					+ "Ent�o vamos movimentar o pe�o escolhido para baixo, para voc� poder mover o Bispo\n");
			
			// Movendo os pe�es necessarios pela escolha do bispo dele
			
			// Tratando o peao 7-3
			tabuleiro[6][3] = tabuleiro[7][3];
			tabuleiro[7][3] = " ";
				
			// tratatando o peao 3-6	
			tabuleiro[6][5] = tabuleiro[7][5];
			tabuleiro[7][5] = " ";
				
			// Imprimindo o tabuleiro com as movimenta��es dos pe�es
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usu�rio pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Voc� vai poder mover apenas uma vez\n"
						+ "Suas op��es de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [7][3]\n"
						+ "--> [6][2]\n"
						+ "Suas op��es de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [3][9]\n"
						+ "--> [4][8]\n"
						+ "--> [5][7]\n"
						+ "--> [6][6]\n"
						+ "--> [7][5]\n");
						
			System.out.println();
				
			// Aqui vai ser resgatado a op��o que o usu�rio escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimenta��o do bispo escolhido pelo usu�rio
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 8-7
				if (positionBispoX == 8 & positionBispoY == 7) {
					// Mostrando os pe�es que precissam ser movidos para mover o bispo
					System.out.print("DIQUINHAS/AVISOS: :)\n"
							+ "\nExiste uma regra, que os Bispos n�o podem pular nenhuma outra pe�a.\n"
							+ "Ent�o vamos movimentar o pe�o escolhido para baixo, para voc� poder mover o Bispo\n");
					
					// Movendo os pe�es necessarios pela escolha do bispo dele
					
					// Tratando o peao 7-6
					tabuleiro[6][6] = tabuleiro[7][6];
					tabuleiro[7][6] = " ";
						
					// tratatando o peao 7-8	
					tabuleiro[6][8] = tabuleiro[7][8];
					tabuleiro[7][8] = " ";
						
					// Imprimindo o tabuleiro com as movimenta��es dos pe�es
					imprimirTabuleiro(tabuleiro); 
						
					// Mostrando pro usu�rio pra onde ele pode mover o bispo
					System.out.println("\nDIQUINHAS/AVISOS: :)\n"
								+ "\n Voc� vai poder mover apenas uma vez\n"
								+ "Suas op��es de jogadas para o Bispo para direita: \n"
								+ "    [L][C]\n"
								+ "--> [7][8]\n"
								+ "--> [6][9]\n"
								+ "Suas op��es de jogadas para o Bispo para esquerda: \n"
								+ "    [L][C]\n"
								+ "--> [3][2]\n"
								+ "--> [4][3]\n"
								+ "--> [5][4]\n"
								+ "--> [6][5]\n"
								+ "--> [7][6]\n");
								
					System.out.println();
						
					// Aqui vai ser resgatado a op��o que o usu�rio escolheu para mover o bispo
					jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
						
					// Imprimindo o tabuleiro com a movimenta��o do bispo escolhido pelo usu�rio
					imprimirTabuleiro(tabuleiro);
						
				}

	} // Final da class main
		
	// 			--------------Impress�o do Tabuleiro---------------------------------------
	public static void imprimirTabuleiro(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }


	}
	
	
	// 				--------------Jogada do Bispo---------------------------------------
	public static void jogadaBispo(String[][] board, int jogada,int jogada2, int posicaox, int posicaoy) {
		int cont =1;
		while(cont ==1) {
			System.out.println("Seu n�mero referente a L(LINHA) do bispo: ");
			jogada = input.nextInt();
			System.out.println("\nSeu n�mero referente a C(COLUNA) do bispo: ");
			jogada2 = input.nextInt();
			board[jogada][jogada2] = board[posicaox][posicaoy];
			board[posicaox][posicaoy] = " ";	
			++cont;
		}
	
	}
}