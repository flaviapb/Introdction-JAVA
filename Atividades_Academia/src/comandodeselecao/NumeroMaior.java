package comandodeselecao;

import java.util.Scanner;

public class NumeroMaior {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		float num1,num2,num3;
		
		System.out.println("Digite o 1� n�mero: ");
		num1 = input.nextFloat();
		System.out.println("Digite o 2� n�mero: ");
		num2 = input.nextFloat();
		System.out.println("Digite o 3� n�mero: ");
		num3 = input.nextFloat();
		
		if ((num1 == num2) && (num1 == num3) && (num2 == num3)) {
			
			System.out.println("Todos os n�meros s�o iguais.");
			
		} else if ((num1 > num2) && (num1 > num3)) {
			
			System.out.println("N�mero 1 � maior.");
			
		} else if ((num2 > num1) && (num2 > num3)) {
			
			System.out.println("N�mero 2 � maior.");
			
		} else if ((num3 > num1) && (num3 > num2)){
			
			System.out.println("N�mero 3 � maior.");

		}
		
		  else if ((num1 == num2) && ((num3 > num1) && (num3 > num2))) {
			
			System.out.println("N�mero 3 � maior.");
			
		}
		
		  else if ((num1 == num3) && ((num2 > num1) && (num2 > num3))) {
				
				System.out.println("N�mero 2 � maior.");
				
		}
		  else if ((num2 == num3) && ((num1 > num2) && (num1 > num3))) {
				
				System.out.println("N�mero 1 � maior.");
				
		}
		  else if ((num1 == num2) && ((num3 < num1) && (num3 < num2))) {
				
				System.out.println("Os n�meros 1 e 2 s�o iguais e maiores.");
				
		}
		
		  else if ((num1 == num3) && ((num2 < num1) && (num2 < num3))) {
				
				System.out.println("Os n�meros 1 e 3 s�o iguais e maiores.");
				
		}
		
		  else if ((num2 == num3) && ((num3 > num1) && (num1 < num2))) {
				
				System.out.println("Os n�meros 2 e 3 s�o iguais e maiores.");
				
		}
	}
}