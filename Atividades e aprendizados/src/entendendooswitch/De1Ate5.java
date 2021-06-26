package entendendooswitch;

import java.util.*;

public class De1Ate5 {
	
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um número entre 1 e 5");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Você escolheu o número 1");
			break;
			
		case 2:
			System.out.println("Você escolheu o número 2");
			break;
			
		case 3:
			System.out.println("Você escolheu o número 3");
			break;
			
		case 4:
			System.out.println("Você escolheu o número 4");
			break;

		case 5:
			System.out.println("Você escolheu o número 5");
			break;
			
		default:
			System.out.printf("Número não está entre 1 e 5.\nVocê escolheu o número %d\n",num);
			break;
		}

	}

}
