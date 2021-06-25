package variavelconstante;

import java.util.Scanner;

// Esse programa foi feito sem a biblioteca(pacote) Math.

public class AreaDeUmCirculo {
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);		
		final float PI = (float) 3.14; 
		float raio,area;
		
		System.out.println("Digite seu raio: ");
		raio = input.nextFloat();
		
		area = (raio * raio) * PI;
		
		System.out.printf("A rea do seu circulo com raio de %.1f é %.1f",raio,area);

		
		
		

	}

}
