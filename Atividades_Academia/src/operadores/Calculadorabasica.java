package operadores;

import java.util.*;
public class Calculadorabasica {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float num1,num2,soma,divisao,multi,subtr;
		
		System.out.print("Digite seu valor do n�mero 1 para realizar as opera��es: \n");
		num1 = input.nextFloat();
		System.out.println("Digite seu valor do n�mero 2 para realizar as opea��es: ");
		num2 = input.nextFloat();
		
		soma = num1 + num2;
		multi = num1 * num2;
		subtr = num1 - num2;
		
		System.out.printf("Sua soma � igual a %.1f\n",soma);
		System.out.printf("Sua subtra��o � igual a %.1f\n",subtr);
		System.out.printf("Sua multiplica��o � igual a %.1f\n",multi);
			
		if (num1 > 0 && num2 > 0) {
			divisao = num1/num2;
			System.out.printf("Sua divis�o � igual a %.1f\n",divisao);
			
			
		} else {
			
			System.out.println("Valor 0 digitado, impossivel dividir.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
