package atividades;

import javax.swing.JOptionPane;

public class RetanguloPrincipal {

	public static void main(String[] args) {
		
		String numaltura, numbase;
		float altura,base;
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		
		JOptionPane.showMessageDialog(null, "Ol� " + nome +" :)\nSeja bem-vindo(a) a nossa calculadora de �rea de ret�ngulos");
		
		numaltura = JOptionPane.showInputDialog("Digite a altura do ret�ngulo: ");
		altura = Float.parseFloat(numaltura);
		
		numbase = JOptionPane.showInputDialog("Digite a base do ret�ngulo: ");
		base = Float.parseFloat(numbase);

		Retangulo novoRetangulo = new Retangulo(altura,base);
		
		novoRetangulo.CalcularArea(altura,base);
		novoRetangulo.CalcularPerimetro(altura,base);;
		novoRetangulo.MostrarResultados(altura,base);
		
		}

}
