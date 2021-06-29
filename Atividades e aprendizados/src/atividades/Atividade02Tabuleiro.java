package atividades;

import java.util.*;

public class Atividade02Tabuleiro {

	private static Scanner input;
		
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println( );
		
		System.out.println("Olá usuário, aqui está a descrição das peças destribuidas no tabuleiro:\n"
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
	
		
		
		// IMPRIMINDO O TABULEIRO SEM MOVIMENTAÇÃO ALGUMA
		for (int i = 0; i < tabuleiro.length; i++) {
			
			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j] + " ");				
			}		
			System.out.println();
		}
		
		
		
		System.out.println();
		int jogadax,jogaday,jogadaxpeao,jogadaypeao,positionBispoX,positionBispoY;
		
		// Dicas de onde estão localizados os bispos
		System.out.println("DIQUINHAS/AVISOS: :)\n"
				+ "\nPosições dos bispos: \n"
				+ "     [L][C]\n"
				+ " --> [1][4]\n"
				+ " --> [1][7]\n"
				+ " --> [8][4]\n"
				+ " --> [8][7]\n"
				+"\nL refere-se as LINHAS --> 1 até 8\n"
				+ "C refere-se as COLUNA --> 2 até 9\n"
				+ "Escolha entre eles, e mova seu bispo!!");
		System.out.println();
		
		System.out.println("Qual a posição L(LINHA) do seu bispo? ");
		positionBispoX = input.nextInt();
		System.out.println("Qual a posição C(COLUNA) do seu bispo? ");
		positionBispoY = input.nextInt();
		System.out.println();
		
		
		// Tratando cada bispo

		if (positionBispoX == 1 & positionBispoY == 4) {
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n"
					+ "\nSuas opções de jogadas para o Peão: \n"
					+ "    [L][C]\n"
					+ "--> [3][3]\n"
					+ "--> [3][5]\n"
					+ "\n");
			
			System.out.println();
			System.out.println("Seu número referente a L(LINHA) do peao: ");
			jogadaxpeao = input.nextInt();
			System.out.println("\nSeu número referente a C(COLUNA) do peao: ");
			jogadaypeao = input.nextInt();
			
			// Tratando o peao 2-3
			if (jogadaxpeao == 3 & jogadaypeao == 3) {
				tabuleiro[3][3] = tabuleiro[2][3];
				tabuleiro[2][3] = " ";
				
				for (int i = 0; i < tabuleiro.length; i++) {	
					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " ");				
					}		
					System.out.println();
				}
				
				System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Você vai poder mover apenas uma vez\n"
						+ "Suas opções de jogadas para o Bispo: \n"
						+ "    [L][C]\n"
						+ "--> [2][3]\n"
						+ "--> [3][2]\n");
						
				System.out.println();
				
				int cont =1;
				while(cont ==1) {
					System.out.println("Seu número referente a L(LINHA) do bispo: ");
					jogadax = input.nextInt();
					System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
					jogaday = input.nextInt();
					tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
					tabuleiro[positionBispoX][positionBispoY] = " ";
					System.out.println();
					for (int i = 0; i < tabuleiro.length; i++) {
						
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
						}		
						System.out.println();
					}
					++cont;
				}
			}// tratando o peao 2-3
			
			// Tratando o peao 2-5
			if (jogadaxpeao == 3 & jogadaypeao == 5) {
					tabuleiro[3][5] = tabuleiro[2][5];
					tabuleiro[2][5] = " ";
							
					for (int i = 0; i < tabuleiro.length; i++) {	
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
							
					System.out.println("\nDIQUINHAS/AVISOS: :)\n"
									+ "\n Você vai poder mover apenas uma vez\n"
									+ "Suas opções de jogadas para o Bispo: \n"
									+ "    [L][C]\n"
									+ "--> [2][5]\n"
									+ "--> [3][6]\n"
									+ "--> [4][7]\n"
									+ "--> [5][8]\n"
									+ "--> [6][9]\n");
					System.out.println();
					
					int cont =1;
					while(cont ==1) {
						System.out.println("Seu número referente a L(LINHA) do bispo: ");
						jogadax = input.nextInt();
						System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
						jogaday = input.nextInt();
						tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
						tabuleiro[positionBispoX][positionBispoY] = " ";
						System.out.println();
						for (int i = 0; i < tabuleiro.length; i++) {
							
							for (int j = 0; j < tabuleiro[i].length; j++) {
								System.out.print(tabuleiro[i][j] + " ");				
							}		
							System.out.println();
						}
						++cont;
					}
														
			} //tratando o peao 2-5
		} // Final do if sobre o bispo 14
		
		// Inicio do if do Bispo 17
		if (positionBispoX == 1 & positionBispoY == 7) {
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n"
					+ "\nSuas opções de jogadas para o Peão: \n"
					+ "    [L][C]\n"
					+ "--> [3][6]\n"
					+ "--> [3][8]\n"
					+ "\n");
			
			System.out.println();
			System.out.println("Seu número referente a L(LINHA) do peao: ");
			jogadaxpeao = input.nextInt();
			System.out.println("\nSeu número referente a C(COLUNA) do peao: ");
			jogadaypeao = input.nextInt();
			
			// Tratando o peao 3-6
			if (jogadaxpeao == 3 & jogadaypeao == 8) {
				tabuleiro[3][8] = tabuleiro[2][8];
				tabuleiro[2][8] = " ";
				
				for (int i = 0; i < tabuleiro.length; i++) {	
					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " ");				
					}		
					System.out.println();
				}
				
				System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						+ "\n Você vai poder mover apenas uma vez\n"
						+ "Suas opções de jogadas para o Bispo: \n"
						+ "    [L][C]\n"
						+ "--> [2][8]\n"
						+ "--> [3][9]\n");
						
				System.out.println();
				
				int cont =1;
				while(cont ==1) {
					System.out.println("Seu número referente a L(LINHA) do bispo: ");
					jogadax = input.nextInt();
					System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
					jogaday = input.nextInt();
					tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
					tabuleiro[positionBispoX][positionBispoY] = " ";
					System.out.println();
					for (int i = 0; i < tabuleiro.length; i++) {
						
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
						}		
						System.out.println();
					}
					++cont;
				}
			}// tratando o peao 3-8
			
			// Tratando o peao 3-6
			if (jogadaxpeao == 3 & jogadaypeao == 6) {
					tabuleiro[3][6] = tabuleiro[2][6];
					tabuleiro[2][6] = " ";
							
					for (int i = 0; i < tabuleiro.length; i++) {	
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
							
					System.out.println("\nDIQUINHAS/AVISOS: :)\n"
									+ "\n Você vai poder mover apenas uma vez\n"
									+ "Suas opções de jogadas para o Bispo: \n"
									+ "    [L][C]\n"
									+ "--> [2][6]\n"
									+ "--> [3][5]\n"
									+ "--> [4][4]\n"
									+ "--> [5][3]\n"
									+ "--> [6][2]\n");
					System.out.println();
					
					int cont =1;
					while(cont ==1) {
						System.out.println("Seu número referente a L(LINHA) do bispo: ");
						jogadax = input.nextInt();
						System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
						jogaday = input.nextInt();
						tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
						tabuleiro[positionBispoX][positionBispoY] = " ";
						System.out.println();
						for (int i = 0; i < tabuleiro.length; i++) {
							
							for (int j = 0; j < tabuleiro[i].length; j++) {
								System.out.print(tabuleiro[i][j] + " ");				
							}		
							System.out.println();
						}
						++cont;
					}
														
			} //tratando o peao 3-8
		} //final do if do Peao 17
		
		// Inicio do if do Bispo 84
		if (positionBispoX == 8 & positionBispoY == 4) {
			System.out.print("DIQUINHAS/AVISOS: :)\n"
							+ "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
							+ "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n"
							+ "\nSuas opções de jogadas para o Peão: \n"
							+ "    [L][C]\n"
							+ "--> [7][3]\n"
							+ "--> [7][5]\n"
							+ "\n");
					
			System.out.println();
			System.out.println("Seu número referente a L(LINHA) do peao: ");
			jogadaxpeao = input.nextInt();
			System.out.println("\nSeu número referente a C(COLUNA) do peao: ");
			jogadaypeao = input.nextInt();
					
			// Tratando o peao 7-3
			if (jogadaxpeao == 7 & jogadaypeao == 3) {
				tabuleiro[6][3] = tabuleiro[7][3];
				tabuleiro[7][3] = " ";
						
				for (int i = 0; i < tabuleiro.length; i++) {	
					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
					}
						
				System.out.println("\nDIQUINHAS/AVISOS: :)\n"
								+ "\n Você vai poder mover apenas uma vez\n"
								+ "Suas opções de jogadas para o Bispo: \n"
								+ "    [L][C]\n"
								+ "--> [6][2]\n"
								+ "--> [7][3]\n");
								
				System.out.println();
						
				int cont =1;
				while(cont ==1) {
					System.out.println("Seu número referente a L(LINHA) do bispo: ");
					jogadax = input.nextInt();
					System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
					jogaday = input.nextInt();
					tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
					tabuleiro[positionBispoX][positionBispoY] = " ";
					System.out.println();
					for (int i = 0; i < tabuleiro.length; i++) {
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
						++cont;
					}
				}// tratando o peao 7-3
					
				// Tratando o peao 7-5
				if (jogadaxpeao == 7 & jogadaypeao == 5) {
					tabuleiro[6][5] = tabuleiro[7][5];
					tabuleiro[7][5] = " ";
									
					for (int i = 0; i < tabuleiro.length; i++) {	
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
									
					System.out.println("\nDIQUINHAS/AVISOS: :)\n"
					+ "\n Você vai poder mover apenas uma vez\n"
					+ "Suas opções de jogadas para o Bispo: \n"
					+ "    [L][C]\n"
					+ "--> [3][9]\n"
					+ "--> [4][8]\n"
					+ "--> [5][7]\n"
					+ "--> [6][6]\n"
					+ "--> [7][5]\n");
					System.out.println();
							
					int cont =1;
					while(cont ==1) {
						System.out.println("Seu número referente a L(LINHA) do bispo: ");
						jogadax = input.nextInt();
						System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
						jogaday = input.nextInt();
						tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
						tabuleiro[positionBispoX][positionBispoY] = " ";
						System.out.println();
						for (int i = 0; i < tabuleiro.length; i++) {	
							for (int j = 0; j < tabuleiro[i].length; j++) {
								System.out.print(tabuleiro[i][j] + " ");				
								}		
							System.out.println();
							}
							++cont;
						}
																
				} //tratando o peao 7-5
		} //final do if do Peao 84
		
		// Inicio do if do Bispo 87
		if (positionBispoX == 8 & positionBispoY == 7) {
			System.out.print("DIQUINHAS/AVISOS: :)\n"
					   + "\nExiste uma regra, que os Bispos não podem pular nenhuma outra peça.\n"
					   + "Então vamos movimentar o peão escolhido para baixo, para você poder mover o Bispo\n"
					   + "\nSuas opções de jogadas para o Peão: \n"
					   + "    [L][C]\n"
					   + "--> [7][6]\n"
					   + "--> [7][8]\n"
					   + "\n");
							
			System.out.println();
			System.out.println("Seu número referente a L(LINHA) do peao: ");
			jogadaxpeao = input.nextInt();
			System.out.println("\nSeu número referente a C(COLUNA) do peao: ");
			jogadaypeao = input.nextInt();
							
			// Tratando o peao 7-8
			if (jogadaxpeao == 7 & jogadaypeao == 8) {
				tabuleiro[6][8] = tabuleiro[7][8];
				tabuleiro[7][8] = " ";
								
				for (int i = 0; i < tabuleiro.length; i++) {	
					for (int j = 0; j < tabuleiro[i].length; j++) {
						System.out.print(tabuleiro[i][j] + " ");				
						}		
						System.out.println();
					}
								
				System.out.println("\nDIQUINHAS/AVISOS: :)\n"
						 	+ "\n Você vai poder mover apenas uma vez\n"
							+ "Suas opções de jogadas para o Bispo: \n"
							+ "    [L][C]\n"
							+ "--> [6][9]\n"
							+ "--> [7][8]\n");
										
				System.out.println();
								
				int cont =1;
				while(cont ==1) {
					System.out.println("Seu número referente a L(LINHA) do bispo: ");
					jogadax = input.nextInt();
					System.out.println("\nSeu número referente a C(COLUNA) do bispo: ");
					jogaday = input.nextInt();
					tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
					tabuleiro[positionBispoX][positionBispoY] = " ";
					System.out.println();
					for (int i = 0; i < tabuleiro.length; i++) {
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
						++cont;
					}
				}// tratando o peao 7-3
							
				// Tratando o peao 7-6
				if (jogadaxpeao == 7 & jogadaypeao == 6) {
					tabuleiro[6][6] = tabuleiro[7][6];
					tabuleiro[7][6] = " ";
											
					for (int i = 0; i < tabuleiro.length; i++) {	
						for (int j = 0; j < tabuleiro[i].length; j++) {
							System.out.print(tabuleiro[i][j] + " ");				
							}		
						System.out.println();
						}
											
					System.out.println("\nDIQUINHAS/AVISOS: :)\n"
							+ "\n Você vai poder mover apenas uma vez\n"
							+ "Suas opções de jogadas para o Bispo: \n"
							+ "    [L][C]\n"
							+ "--> [3][9]\n"
							+ "--> [4][8]\n"
							+ "--> [5][7]\n"
							+ "--> [6][6]\n"
							+ "--> [7][5]\n");
					System.out.println();
									
					int cont =1;
					while(cont ==1) {
						System.out.println("Seu número referente a L(LINHA) do bispo: ");
						jogadax = input.nextInt();
						System.out.println("\nSeu número referente ao C(COLUNA) do bispo: ");
						jogaday = input.nextInt();
						tabuleiro[jogadax][jogaday] = tabuleiro[positionBispoX][positionBispoY];
						tabuleiro[positionBispoX][positionBispoY] = " ";
						System.out.println();
						for (int i = 0; i < tabuleiro.length; i++) {	
							for (int j = 0; j < tabuleiro[i].length; j++) {
								System.out.print(tabuleiro[i][j] + " ");				
								}		
							System.out.println();
							}
							++cont;
				}																	
			} //tratando o peao 7-5
		} //final do if do Peao 84
	}
}
