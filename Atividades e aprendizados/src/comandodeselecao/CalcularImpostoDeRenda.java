package comandodeselecao;

import java.util.Scanner;

public class CalcularImpostoDeRenda {
	
	private static Scanner entrada;
	
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		float salario;
		
		System.out.print("Digite seu salário: ");
		salario = entrada.nextFloat();
		
		if (salario == 1903.98) {
			
			System.out.print("Insento");
			
		} else if (salario > 1903.98 && salario <= 2853.44) {
			
			System.out.printf("Seu imposto é de 142,80$, logo seu salário final é de %.2f",(salario-142.80));
		}
		
		else if (salario > 2853.44 && salario <= 3804.64) {
			
			System.out.printf("Seu imposto é de 356,81$, logo seu salário final é de %.2f",(salario-356.81));
		}
		
		else if (salario > 3804.64 && salario <= 4753.96) {
			
			System.out.printf("Seu imposto é de 642,15$, logo seu salário final é de %.2f",(salario-642.15));
		}
		
		if (salario > 4753.96) {
			
			System.out.printf("Seu imposto é de 879,85$, logo seu salário final é de %.2 f",(salario-879.85));
			
		}
	
	}

}
