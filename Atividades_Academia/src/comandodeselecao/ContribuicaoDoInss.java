package comandodeselecao;

import java.util.Scanner;

public class ContribuicaoDoInss {
	
	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		float salario;
		
		System.out.print("Digite seu salário: ");
		salario = entrada.nextFloat();
		
		if (salario == 1556.94) {
			
			float inss = (float) (salario * 0.08);
			System.out.printf("Seu salario de %.2f, com desconto de %.1f é igual a %.2f",salario,inss,(salario-inss));
			
		} else if (salario >= 1556.95 && salario <= 2594.92){
			
			float inss = (float) (salario * 0.09);
			System.out.printf("Seu salario de %.2f, com desconto de %.1f é igual a %.2f",salario,inss,(salario-inss));
				
		}
		
		else {
			
			float inss = (float) (salario * 0.11);
			System.out.printf("Seu salario de %.2f, com desconto de %.1f é igual a %.2f",salario,inss,(salario-inss));
		}


	}

}
