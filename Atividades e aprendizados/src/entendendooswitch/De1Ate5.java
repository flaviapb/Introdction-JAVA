package entendendooswitch;

import java.util.*;

public class De1Ate5 {
	
	private static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um n�mero entre 1 e 5");
		num = input.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Voc� escolheu o n�mero 1");
			break;
			
		case 2:
			System.out.println("Voc� escolheu o n�mero 2");
			break;
			
		case 3:
			System.out.println("Voc� escolheu o n�mero 3");
			break;
			
		case 4:
			System.out.println("Voc� escolheu o n�mero 4");
			break;

		case 5:
			System.out.println("Voc� escolheu o n�mero 5");
			break;
			
		default:
			System.out.printf("N�mero n�o est� entre 1 e 5.\nVoc� escolheu o n�mero %d\n",num);
			break;
		}

	}

}
