package loopfor;

public class pareimpar {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			
			if (i % 2 == 0) {
				System.out.printf("O número %d é par\n",i);
			}
			else {
				System.out.printf("O número %d é impar\n", i);
			}
		}

	}

}
