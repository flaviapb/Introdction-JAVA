package atividades;

import javax.swing.JOptionPane;

public class CirculoPrincipal {

	public static void main(String[] args) {
		
		String numraio,vezes;
		float raio;
		int vezesnum;

		
		JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) a nossa calculadora de área de circulos");
		
		vezes = JOptionPane.showInputDialog("Quantas áreas você quer calcular? ");
		vezesnum = Integer.parseInt(vezes);
		
		for (int i = 0; i < vezesnum; i++) {
			
			numraio = JOptionPane.showInputDialog("Digite o raio do circulo: ");
			raio = Float.parseFloat(numraio);
			
			AreaCirculo NovoCirculo = new AreaCirculo(); 
			
			NovoCirculo.CalcularArea(raio);
			NovoCirculo.CalcularPerimetro(raio);
			NovoCirculo.MostrarResultados(raio);
		}
		
	}

}
