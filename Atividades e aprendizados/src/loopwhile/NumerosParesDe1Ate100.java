package loopwhile;

public class NumerosParesDe1Ate100 {
	
	public static void main(String[] args) {
		
		int num=1;
		
		while(num <= 100) {
			
			if(num % 2 == 0) {
				
				System.out.printf("%d é par\n", num);
				
			}
			
			num++;
		}
		
	}

}
