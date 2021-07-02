package atividades;

import javax.swing.JOptionPane;

public class Retangulo {

	private float lado1,lado2,area,perimetro;
	
	public Retangulo() {
		
	}
	
	public Retangulo(float lado1, float lado2) {
		
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	public void CalcularArea(float lado1, float lado2) {
		area = lado1 * lado2;
	}
	
	public void CalcularPerimetro(float lado1,float lado2) {
		perimetro = (2 * lado1 ) + (2 * lado2);
	}
	
	public void MostrarResultados(float lado1,float lado2) {
		JOptionPane.showMessageDialog(null, "Dados informados: \n" +
				"Altura = "+ lado1 + "\nBase = " + lado2 + "\nSaidas correspondentes:\n" +"Seu perimetro = "
				+ perimetro + "\nSua área = " + area, "Retângulo", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	