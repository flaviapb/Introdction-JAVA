package atividades;

import javax.swing.JOptionPane;

public class TabuleiroComJOntionPane {

	public static void main(String[] args) {
		
		
		// Saber qual nome do úsuario

		String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		
		// Tabela para usuário saber quais peças estão no tabuleiro

		JOptionPane.showMessageDialog(null, "Olá " + nome +", aqui está a descrição das peças destribuidas no tabuleiro:\n"
				+ "\nT --> TORRE\n"
				+ "C --> CAVALO\n"
				+ "B --> BISPO\n"
				+ "D --> DAMA\n"
				+ "R --> REI\n"
				+ "P --> PEAO" );
	
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

		
		// IMPRIMINDO O TABULEIRO SEM MOVIMENTAÇÃO ALGUMA
		imprimirTabuleiro(tabuleiro);
		
		// Tipando minhas variaveis 

		int jogadax = 0,jogaday =0;
		
		// Dicas de onde estão localizados os bispos
		System.out.println("\nDIQUINHAS/AVISOS: :)\n"
				+ "\nPosições dos bispos: \n"
				+ "     [L][C]\n"
				+ " --> [1][4]\n"
				+ " --> [1][7]\n"
				+ " --> [8][4]\n"
				+ " --> [8][7]\n"
				+"\nL refere-se as LINHAS --> 1 até 8\n"
				+ "C refere-se as COLUNA --> 2 até 9\n"
				+ "Escolha entre eles, e mova seu bispo!!");
		
		// Pegando do usuário qual Bispo vai ser tratado
		
		String bispox,bispoy;
		int positionBispoX, positionBispoY;
		
	
		bispox = JOptionPane.showInputDialog(null, "Qual a posição L(LINHA) do seu bispo? ");
		positionBispoX = Integer.parseInt(bispox);
		bispoy = JOptionPane.showInputDialog(null,"Qual a posição C(COLUNA) do seu bispo? ");
		positionBispoY = Integer.parseInt(bispoy);
		
		// Tratando cada bispo

		// Trabalhando com o bispo 1-4
		if (positionBispoX == 1 & positionBispoY == 4) {
			// Mostrando os peões que precissam ser movidos para mover o bispo
			JOptionPane.showMessageDialog(null,"DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n");
			
			// Movendo os peões necessarios pela escolha do bispo dele
			
			// Tratando o peao 2-3
			tabuleiro[3][3] = tabuleiro[2][3];
			tabuleiro[2][3] = " ";
				
			// tratatando o peao 2-5	
			tabuleiro[3][5] = tabuleiro[2][5];
			tabuleiro[2][5] = " ";
				
			// Imprimindo o tabuleiro com as movimentações dos peões
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usuário pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Você vai poder mover apenas uma vez\n"
						+ "Suas opções de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [2][3]\n"
						+ "--> [3][2]\n"
						+ "Suas opções de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [2][5]\n"
						+ "--> [3][6]\n"
						+ "--> [4][7]\n"
						+ "--> [5][8]\n"
						+ "--> [6][9]\n");
						
			// Aqui vai ser resgatado a opção que o usuário escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimentação do bispo escolhido pelo usuário
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 1-7
		if (positionBispoX == 1 & positionBispoY == 7) {
			// Mostrando os peões que precissam ser movidos para mover o bispo
			JOptionPane.showMessageDialog(null,"DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n");
			
			// Movendo os peões necessarios pela escolha do bispo dele
			
			// Tratando o peao 3-8
			tabuleiro[3][8] = tabuleiro[2][8];
			tabuleiro[2][8] = " ";
				
			// tratatando o peao 3-6	
			tabuleiro[3][6] = tabuleiro[2][6];
			tabuleiro[2][6] = " ";
				
			// Imprimindo o tabuleiro com as movimentações dos peões
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usuário pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Você vai poder mover apenas uma vez\n"
						+ "Suas opções de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [2][8]\n"
						+ "--> [3][9]\n"
						+ "Suas opções de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [2][6]\n"
						+ "--> [3][5]\n"
						+ "--> [4][4]\n"
						+ "--> [5][3]\n"
						+ "--> [6][2]\n");
										
			// Aqui vai ser resgatado a opção que o usuário escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimentação do bispo escolhido pelo usuário
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 8-4
		if (positionBispoX == 8 & positionBispoY == 4) {
			// Mostrando os peões que precissam ser movidos para mover o bispo
			JOptionPane.showMessageDialog(null,"DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n");
			
			// Movendo os peões necessarios pela escolha do bispo dele
			
			// Tratando o peao 7-3
			tabuleiro[6][3] = tabuleiro[7][3];
			tabuleiro[7][3] = " ";
				
			// tratatando o peao 3-6	
			tabuleiro[6][5] = tabuleiro[7][5];
			tabuleiro[7][5] = " ";
				
			// Imprimindo o tabuleiro com as movimentações dos peões
			imprimirTabuleiro(tabuleiro); 
				
			// Mostrando pro usuário pra onde ele pode mover o bispo
			System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Você vai poder mover apenas uma vez\n"
						+ "Suas opções de jogadas para o Bispo para esquerda: \n"
						+ "    [L][C]\n"
						+ "--> [7][3]\n"
						+ "--> [6][2]\n"
						+ "Suas opções de jogadas para o Bispo para direita: \n"
						+ "    [L][C]\n"
						+ "--> [3][9]\n"
						+ "--> [4][8]\n"
						+ "--> [5][7]\n"
						+ "--> [6][6]\n"
						+ "--> [7][5]\n");
						
			// Aqui vai ser resgatado a opção que o usuário escolheu para mover o bispo
			jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
				
			// Imprimindo o tabuleiro com a movimentação do bispo escolhido pelo usuário
			imprimirTabuleiro(tabuleiro);
				
		}
		
		// Trabalhando com o bispo 8-7
		if (positionBispoX == 8 & positionBispoY == 7) {
				// Mostrando os peões que precissam ser movidos para mover o bispo
				JOptionPane.showMessageDialog(null,"DIQUINHAS/AVISOS: :)\n"
							+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
							+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n");
					
				// Movendo os peões necessarios pela escolha do bispo dele
					
				// Tratando o peao 7-6
				tabuleiro[6][6] = tabuleiro[7][6];
				tabuleiro[7][6] = " ";
						
				// tratatando o peao 7-8	
				tabuleiro[6][8] = tabuleiro[7][8];
				tabuleiro[7][8] = " ";
						
				// Imprimindo o tabuleiro com as movimentações dos peões
				imprimirTabuleiro(tabuleiro); 
						
				// Mostrando pro usuário pra onde ele pode mover o bispo
				System.out.println("\nDIQUINHAS/AVISOS: :)\n"
								+ "\n Você vai poder mover apenas uma vez\n"
								+ "Suas opções de jogadas para o Bispo para direita: \n"
								+ "    [L][C]\n"
								+ "--> [7][8]\n"
								+ "--> [6][9]\n"
								+ "Suas opções de jogadas para o Bispo para esquerda: \n"
								+ "    [L][C]\n"
								+ "--> [3][2]\n"
								+ "--> [4][3]\n"
								+ "--> [5][4]\n"
								+ "--> [6][5]\n"
								+ "--> [7][6]\n");
								
				// Aqui vai ser resgatado a opção que o usuário escolheu para mover o bispo
				jogadaBispo(tabuleiro, jogadax, jogaday, positionBispoX, positionBispoY);
						
				// Imprimindo o tabuleiro com a movimentação do bispo escolhido pelo usuário
				imprimirTabuleiro(tabuleiro);
						
			} 

	} // Final da class main
		
	// 			--------------Impressão do Tabuleiro---------------------------------------
	public static void imprimirTabuleiro(String[][] board) {
		 for (int i = 0; i < board.length; i++) {
		        for (int j = 0; j < board[i].length; j++) {
		        	System.out.print(board[i][j]+"  ");
		        }
		        System.out.println("");
		    }
	}
	
	
	// 				--------------Jogada do Bispo---------------------------------------
	public static void jogadaBispo(String[][] board, int jogadal,int jogadac, int posicaox, int posicaoy) {
		int cont =1;
		while(cont ==1) {
			String jogada1 = JOptionPane.showInputDialog("Seu número referente a L(LINHA) do bispo: ");
			jogadal = Integer.parseInt(jogada1);
			String jogada2 = JOptionPane.showInputDialog("\nSeu número referente a C(COLUNA) do bispo: ");
			jogadac = Integer.parseInt(jogada2);
			board[jogadal][jogadac] = board[posicaox][posicaoy];
			board[posicaox][posicaoy] = " ";	
			++cont;
		}
	
	}
}