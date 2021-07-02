package atividades;

import javax.swing.JOptionPane;

public class AreaCirculo {

	private float raio,area,perimetro;
	final float PI = (float)3.14;
	
	public void Circulo() {
		
	}
	
	public void Circulo(float raio) {
		
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}
	
	public void CalcularArea(float raio) {
		area = (raio * raio) * PI;
	}
	
	public void CalcularPerimetro(float raio) {
		perimetro = (2 * PI * raio);
	}
	
	public void MostrarResultados(float raio) {
		JOptionPane.showMessageDialog(null, "Dados informados: \n" +
				"Raio = "+ raio+ "\nSaidas correspondentes:\n" +"Seu perimetro = "
				+ perimetro + "\nSua área = " + area, "Circulo", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
