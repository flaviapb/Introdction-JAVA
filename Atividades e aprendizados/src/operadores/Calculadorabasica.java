package operadores;

import java.util.*;
public class Calculadorabasica {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float num1,num2,soma,divisao,multi,subtr;
		
		System.out.print("Digite seu valor do número 1 para realizar as operações: \n");
		num1 = input.nextFloat();
		System.out.println("Digite seu valor do número 2 para realizar as opeações: ");
		num2 = input.nextFloat();
		
		soma = num1 + num2;
		multi = num1 * num2;
		subtr = num1 - num2;
		
		System.out.printf("Sua soma é igual a %.1f\n",soma);
		System.out.printf("Sua subtração é igual a %.1f\n",subtr);
		System.out.printf("Sua multiplicação é igual a %.1f\n",multi);
			
		if (num1 > 0 && num2 > 0) {
			divisao = num1/num2;
			System.out.printf("Sua divisão é igual a %.1f\n",divisao);
			
			
		} else {
			
			System.out.println("Valor 0 digitado, impossivel dividir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
