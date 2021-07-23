package sobretiposdedados;

public class TrocandoOTipoDoDado {

	public static void main(String[] args) {
		// O Programa vai fazer uma conversão de um tipo int para uma string.
		int idade = 30;
		String valor = Integer.toString(idade);
		System.out.printf("Sua idade em formato de string é %s;\n",valor);
		
		// O Programa vai fazer uma conversão de um tipo string para um int.
		
		String idade1 = "40";
		int valor1 = Integer.parseInt(idade1);
		System.out.printf("Sua idade em formato de int é %d;\n",valor1);
		
		// O Programa vai fazer uma conversão de um tipo string para um float.
		
		String idade2 = "40.5";
		float valor2 = Float.parseFloat(idade2);
		System.out.printf("Sua idade em formato de float é %.1f.\n",valor2);

	}

}
