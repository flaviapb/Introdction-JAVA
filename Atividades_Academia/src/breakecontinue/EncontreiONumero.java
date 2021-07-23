package breakecontinue;

import java.util.*;
public class EncontreiONumero {

	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite o número entre 1 e 10: ");
		num = input.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			
			if (i == num) {
				
				System.out.printf("Seu número é o %d",i);
				break;
			} else {
				continue;

			}
			
		}
	}
}
