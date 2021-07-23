package vetoresouarrays;

import java.util.*; 

public class NotasDeAlunos {
	
	private static Scanner input;
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		int numalunos = 5;
		double[] notas = new double[numalunos]; // Aqui é um array unidimensional.
		
		for (int i = 0; i < numalunos; i++) {
			
			System.out.printf("Digite a nota do %d aluno: ",i+1);
			notas[i] = input.nextDouble();
		}

		for (int i = 0; i < numalunos; i++) {
			
			System.out.printf("Nota do %d aluno --> %.1f\n",i+1,notas[i]);
		}
	}

}
