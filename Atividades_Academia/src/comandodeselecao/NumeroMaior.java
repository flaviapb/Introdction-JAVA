package comandodeselecao;

import java.util.Scanner;

public class NumeroMaior {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		float num1,num2,num3;
		
		System.out.println("Digite o 1° número: ");
		num1 = input.nextFloat();
		System.out.println("Digite o 2° número: ");
		num2 = input.nextFloat();
		System.out.println("Digite o 3° número: ");
		num3 = input.nextFloat();
		
		if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			
			System.out.println("Todos os números são iguais.");
			
		} else if ((num1 > num2) && (num1 > num3)) {
			
			System.out.println("Número 1 é maior.");
			
		} else if ((num2 > num1) && (num2 > num3)) {
			
			System.out.println("Número 2 é maior.");
			
		} else if ((num3 > num1) && (num3 > num2)){
			
			System.out.println("Número 3 é maior.");

		}
		
		  else if ((num1 == num2) && ((num3 > num1) && (num3 > num2))) {
			
			System.out.println("Número 3 é maior.");
			
		}
		
		  else if ((num1 == num3) && ((num2 > num1) && (num2 > num3))) {
				
				System.out.println("Número 2 é maior.");
				
		}
		  else if ((num2 == num3) && ((num1 > num2) && (num1 > num3))) {
				
				System.out.println("Número 1 é maior.");
				
		}
		  else if ((num1 == num2) && ((num3 < num1) && (num3 < num2))) {
				
				System.out.println("Os números 1 e 2 são iguais e maiores.");
				
		}
		
		  else if ((num1 == num3) && ((num2 < num1) && (num2 < num3))) {
				
				System.out.println("Os números 1 e 3 são iguais e maiores.");
				
		}
		
		  else if ((num2 == num3) && ((num3 > num1) && (num1 < num2))) {
				
				System.out.println("Os números 2 e 3 são iguais e maiores.");
				
		}
	}
}