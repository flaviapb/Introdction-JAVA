package atividade05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DespesaPrincipal {

	public static void main(String[] args) {
		
		ArrayList<DespesaDia> listaDespesa = new ArrayList<DespesaDia>();
		
		String mesString, valorString,qntdcompraString;
		int mes,qntdcompra;
		float valor;
		
		
		do {
			mesString = JOptionPane.showInputDialog("Digite o m�s que vai ser calculado as despesas: ");
			mes = Integer.parseInt(mesString);
		} while (mes < 1 || mes > 12);
		
		
		qntdcompraString = JOptionPane.showInputDialog("Digite quantas compras voc� fez nesse m�s: ");
		qntdcompra = Integer.parseInt(qntdcompraString);
		
		valorString = JOptionPane.showInputDialog("Digite o valor da sua fatura: "); //Vai ser considerado, o mesmo valor para todas as compras.
		valor = Float.parseFloat(valorString);
		
		
		if(mes == 2) {
			int dia = 28;
			listaDespesa.add(new DespesaDia(dia,mes,valor));
			DespesasTotal faturaTotal = new DespesasTotal("123.456.789-10", listaDespesa);
			System.out.print("A pessoa com CPF = "+faturaTotal.getCpf() + " gastou gasto no m�s "+ mes +" : "+faturaTotal.totalMes(qntdcompra) + "\n"); //Retornando a multiplica��o
		}
		
		else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 11) {
			int dia = 31;
			listaDespesa.add(new DespesaDia(dia,mes,valor));
			DespesasTotal faturaTotal = new DespesasTotal("123.456.789-10", listaDespesa);
			System.out.print("A pessoa com CPF = "+faturaTotal.getCpf() + " gastou gasto no m�s "+ mes +" : "+faturaTotal.totalMes(qntdcompra) + "\n"); //Retornando a multiplica��o
		}
		
		else if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			int dia = 30;
			listaDespesa.add(new DespesaDia(dia,mes,valor));
			DespesasTotal faturaTotal = new DespesasTotal("123.456.789-10", listaDespesa);
			System.out.print("A pessoa com CPF = "+faturaTotal.getCpf() + " gastou gasto no m�s "+ mes +" : "+faturaTotal.totalMes(qntdcompra) + "\n"); //Retornando a multiplica��o
		}
		
		
		
	
		

		
		
		
		
		
	}

}
