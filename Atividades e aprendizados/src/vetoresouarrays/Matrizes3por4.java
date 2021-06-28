package vetoresouarrays;

public class Matrizes3por4 {

	public static void main(String[] args) {
		
		
		double[][] notasAlunos = new double[3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 8;
		notasAlunos[0][2] = 7;
		notasAlunos[0][3] = 10;
		
		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 3;
		notasAlunos[1][2] = 7.8;
		notasAlunos[1][3] = 10;
		
		notasAlunos[2][0] = 10;
		notasAlunos[2][1] = 8.7;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 9.3;
		
		//Imprimindo Matriz na tela;
		
		System.out.println("Notas dos alunos sem modificação");
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//Modificando nota do aluno;
		
		System.out.println();
		
		notasAlunos[1][0] =7;
		notasAlunos[1][1] =7;
		
		System.out.println("Notas dos alunos com modificação");
		
		for (int i = 0; i < notasAlunos.length; i++) {
			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " ");
				
			}
			System.out.println();
		}
		
		// Calculando média de cada aluno
		System.out.println();
		System.out.println("Calculando média dos alunos");
		
		double soma;
		
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;			
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
		System.out.printf("A média do aluno %d é = %.2f\n", i+1,(soma/4));			
		}
		
		
		
		
		
		
		
		
		
	}
}
