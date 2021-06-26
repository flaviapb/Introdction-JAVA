package loopfor;

public class Somaentrenumeros {
	
	public static void main(String[] args) {
		
		int soma = 0;
		
		for (int i = 1; i <= 50; i++) {
			 
			soma = soma + i;
			
		}
		
		System.out.printf("A soma entre 1 e 50 é %d\n",soma);
		
		
		for (int i = 50; i <= 100; i++) {
			 
			soma = soma + i;
			
		}
		
		System.out.printf("A soma entre 50 e 100 é %d\n",soma);
		
		for (int i = 0; i <= 10; i++) {
			 
			System.out.printf("%d" + " ",i);
					
		}
		
		System.out.print("\n");
		
		for (int i = 10; i >= 0; i--) {
			 
			System.out.printf("%d" + " " ,i);
					
		}
		
	}
	
	

}
