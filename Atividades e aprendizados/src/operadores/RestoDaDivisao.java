package operadores;

import java.util.*;
public class RestoDaDivisao {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		float num1,num2;
		
		System.out.print("Digite seu 1� n�mero: ");
		num1 = entrada.nextFloat();
		
		System.out.print("Digite seu 2� n�mero: ");
		num2 = entrada.nextFloat();
		
		System.out.printf("Sua divis�o � %.0f \n",num1/num2);
		System.out.printf("O resto da sua divisi�o � %.1f",num1%num2);
		

	}

}
