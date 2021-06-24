package sobretiposdedados;

import java.util.Scanner;

public class CalculatorAnoDeNascimento {

	private static Scanner entrada; //Aqui é chamando meu Scanner e atribuindo o nome entrada.

	public static void main(String[] args) {
        entrada = new Scanner(System.in);
		int ano;
		System.out.print("Digite o ano do seu nascimento: ");
		ano = entrada.nextInt();
		
		int anoAtual = (int)2021;
		
		if (ano <= anoAtual) {
			
			System.out.printf("Sua idade no ano de %d é %d.",anoAtual,(anoAtual-ano));
			
		} else {
			System.out.print("Ano de nascimento maior que ano atual");

		}
		
		
		
		

	}

}
