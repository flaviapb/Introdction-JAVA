package sef.module4.sample;

public class CanetaPrincipal {

	public static void main(String[] args) {
//		Caneta2 c1 = new Caneta2("Azul", "BIC");

		Caneta c1 = new Caneta();
		c1.setCor("Azul");
		c1.setMarca("bic");
		c1.setTampada(true);
		c1.setVazia(false);
		
		System.out.println(c1.getCor()+"   "+ c1.getMarca());
		
		Caneta c2 = new Caneta();
		c2.setCor("Vermelha");
		c2.setMarca("Futura");

		System.out.println(c2.getCor()+"   "+ c2.getMarca());
		
		c1.Destampar();
		c1.Riscar();
		c1.Tampar();
		c1.Exibir();
		
		Caneta2 c2a = new Caneta2();
		c2a.setCor("Amarelo");
		c2a.setMarca("bic");

		//Caneta2 c2b = new Caneta2("Marrom", "Quilometrica");
		
	}

}
