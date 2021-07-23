package jogodaadvinha�ao;

import java.util.*;

public class Advinharnumero {
	private static Scanner input;
	private static Random random;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		random = new Random();
		
		int tentativas = 5;
		int numeroaleatorio = random.nextInt(50);
		int jogada = 0;
		
		
	
		while (tentativas > 0 && jogada != numeroaleatorio) {
			
			System.out.println("Digite sua jogada: ");
			jogada = input.nextInt();
			
			
			
			if (tentativas > 0 && jogada == numeroaleatorio) {
				
				System.out.printf("Seu n�mero escolhido � igual o meu.", jogada,numeroaleatorio);
			break;
			}
			
			else {
				System.out.println("Errou!");
			}
			
			tentativas --;
			
		}
		
		if (tentativas == 0) {
		System.out.println("Acabaram suas chances, at� mais!! ;)");
		}
	}

}
