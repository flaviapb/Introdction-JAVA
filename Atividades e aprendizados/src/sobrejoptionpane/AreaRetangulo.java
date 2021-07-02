package sobrejoptionpane;

import javax.swing.JOptionPane;

public class AreaRetangulo {

	public static void main(String[] args) {
		
		String numaltura, numbase;
		float altura,base,area;
		
		
		numaltura = JOptionPane.showInputDialog("Digite a altura do retangulo: ");
		altura = Float.parseFloat(numaltura);
		
		numbase = JOptionPane.showInputDialog("Digite a base do retangulo: ");
		base = Float.parseFloat(numbase);
	
				
				
		area = (altura * base);
				
		JOptionPane.showMessageDialog(null,area,"Sua area é: ", JOptionPane.PLAIN_MESSAGE);
		
		
				
				
			}

		}

	
