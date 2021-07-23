package atividades;

import java.text.DateFormat;
import java.util.*;
import javax.swing.JOptionPane;

public class FuncionarioPrincipal {

	public static void main(String[] args) {
	
		//Atualizando com os valores dito no slide
		System.out.println("--------------------Teste da atividade---------------------------");
		Funcionario novoFuncionario = new Funcionario();
		novoFuncionario.setNome("Luiz");
		novoFuncionario.setSobrenome("Silva");
		novoFuncionario.setHorasTrabalhadas(10);
		novoFuncionario.setValorPorHora(25.50);
		novoFuncionario.nomeCompleto();
		novoFuncionario.calcularSalario();
		novoFuncionario.incrementarHoras(8);
		Imprimir_Implemento();
		novoFuncionario.calcularSalario();
		Imprimir_Tracado();	
		
		//Inicializando/Criando uma ArrayList
		ArrayList<Funcionario> lista_funcionarios = new ArrayList<Funcionario>();
		
		//Instanciando os 9 novos funcionarios.
		Funcionario funcionario01 = new Funcionario();
		Funcionario funcionario02 = new Funcionario();
		Funcionario funcionario03 = new Funcionario();
		Funcionario funcionario04 = new Funcionario();
		Funcionario funcionario05 = new Funcionario();
		Funcionario funcionario06 = new Funcionario();
		Funcionario funcionario07 = new Funcionario();
		Funcionario funcionario08 = new Funcionario();
		Funcionario funcionario09 = new Funcionario();
		
		//Variaveis utilizadas no JOptionPane
		String qntd_hora;
		int horaextra;
		
		System.out.println("--------------------Dados do Funcionario 01---------------------------");
		funcionario01.setNome("Pedro");
		funcionario01.setSobrenome("Sousa");
		funcionario01.setHorasTrabalhadas(12);
		funcionario01.setValorPorHora(30.99);
		funcionario01.nomeCompleto();
		funcionario01.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 1: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario01.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario01.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 02---------------------------");
		funcionario02.setNome("Roberta");
		funcionario02.setSobrenome("Silva");
		funcionario02.setHorasTrabalhadas(16);
		funcionario02.setValorPorHora(30.99);
		funcionario02.nomeCompleto();
		funcionario02.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 2: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario02.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario02.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 03---------------------------");
		funcionario03.setNome("Renata");
		funcionario03.setSobrenome("Calvacante");
		funcionario03.setHorasTrabalhadas(11);
		funcionario03.setValorPorHora(30.99);
		funcionario03.nomeCompleto();
		funcionario03.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 3: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario03.incrementarHoras(horaextra);
		System.out.println("\nSeu salario com a implementação das horas");
		funcionario03.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 04---------------------------");
		funcionario04.setNome("Diogo");
		funcionario04.setSobrenome("Pereira");
		funcionario04.setHorasTrabalhadas(15);
		funcionario04.setValorPorHora(30.99);
		funcionario04.nomeCompleto();
		funcionario04.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 4: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario04.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario04.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 05---------------------------");
		funcionario05.setNome("Rodolfo");
		funcionario05.setSobrenome("Vieira");
		funcionario05.setHorasTrabalhadas(10);
		funcionario05.setValorPorHora(30.99);
		funcionario05.nomeCompleto();
		funcionario05.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 5: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario05.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario05.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 06---------------------------");
		funcionario06.setNome("Flávio");
		funcionario06.setSobrenome("Junior");
		funcionario06.setHorasTrabalhadas(19);
		funcionario06.setValorPorHora(30.99);
		funcionario06.nomeCompleto();
		funcionario06.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 6: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario06.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario06.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 07---------------------------");
		funcionario07.setNome("Rosa");
		funcionario07.setSobrenome("Maria");
		funcionario07.setHorasTrabalhadas(18);
		funcionario07.setValorPorHora(30.99);
		funcionario07.nomeCompleto();
		funcionario07.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 7: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario07.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario07.calcularSalario();	
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 08---------------------------");
		funcionario08.setNome("Bianca");
		funcionario08.setSobrenome("Diniz");
		funcionario08.setHorasTrabalhadas(8);
		funcionario08.setValorPorHora(30.99);
		funcionario08.nomeCompleto();
		funcionario08.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 8: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario08.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario08.calcularSalario();
		Imprimir_Tracado();
		
		System.out.println("\n--------------------Dados do Funcionario 09---------------------------");
		funcionario09.setNome("Vitor");
		funcionario09.setSobrenome("Henrique");
		funcionario09.setHorasTrabalhadas(6);
		funcionario09.setValorPorHora(30.99);
		funcionario09.nomeCompleto();
		funcionario09.calcularSalario();
		qntd_hora = JOptionPane.showInputDialog("Digite o total de horas extras do funcionario 9: ");
		horaextra = Integer.parseInt(qntd_hora);
		funcionario09.incrementarHoras(horaextra);
		Imprimir_Implemento();
		funcionario09.calcularSalario();
		Imprimir_Tracado();
		
		//Mensagem informando das atualizações
		JOptionPane.showMessageDialog(null, "Todas as horas extras, dos 9 funcionarios, foram atualizadas.");
		
		//Adicionando tudo dentro do array
		lista_funcionarios.add(funcionario01);
		lista_funcionarios.add(funcionario02);
		lista_funcionarios.add(funcionario03);
		lista_funcionarios.add(funcionario04);
		lista_funcionarios.add(funcionario05);
		lista_funcionarios.add(funcionario06);
		lista_funcionarios.add(funcionario07);
		lista_funcionarios.add(funcionario08);
		lista_funcionarios.add(funcionario09);
		
		//Pegando Data atual do sistema
		DateFormat data = DateFormat.getDateInstance(DateFormat.SHORT);
		JOptionPane.showMessageDialog(null,"Cadastros atualizados na data: " + data.format(new Date()) +
											"\nObrigada pela atualização :) .");
	}
	
	public static void Imprimir_Implemento() {
		System.out.println("\nSeu salario com a implementação das horas");
	}
	
	public static void Imprimir_Tracado() {
		System.out.println("------------------------------------------------------------------------");
	}
}