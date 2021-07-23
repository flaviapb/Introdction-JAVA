package interagindocomousuario;

import java.util.Scanner;

public class AreaDeUmRetangulo {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);

		float altura,base,area;
		
		System.out.println("Digite sua altura: ");
		altura = input.nextFloat();
		System.out.println("Digite sua base: ");
		base = input.nextFloat();
		
		area = (altura * base);
		
		System.out.printf("Sua area com altura %.1f e com base %.1f é igual a %.1f",altura,base,area);
		
		
	}

}
