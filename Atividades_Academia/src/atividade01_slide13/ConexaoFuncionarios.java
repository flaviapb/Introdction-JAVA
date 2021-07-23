package atividade01_slide13;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoFuncionarios {
	
	public static void main(String[] args) {
	
		//CONECTANDO NO BANCO DE DADOS
		try {
			String url = "jdbc:mysql://localhost/funcionarios";
			String user = "root";
			String pass = "Aa74859610aA";

			Connection cn = DriverManager.getConnection(url, user, pass);
			cn.setAutoCommit(false);
			System.out.println("Conexão realizada com sucesso! \n");
			
			//CRIANDO O PREPAREDSTATEMENT
			PreparedStatement pStmt = cn.prepareStatement("INSERT INTO dados_funcionarios(id,nome_funcionario,cargo,salario,horas_trabalhadas,cidade) VALUES(?,?,?,?,?,?)");
			
			//ALTERANDO OS VALORES DO PREPAREDSTATEMENT, COM INTERAÇÃO DO USUÁRIO
			String vezesS = JOptionPane.showInputDialog("Quantos funcionários você quer atribuir na tabela? ");
			int vezes = Integer.parseInt(vezesS);
			
			if (vezes > 0) {
				for (int i = 0; i < vezes; i++) {
					
					String Idstring = JOptionPane.showInputDialog("Digite o ID do funcionário? ");
					int Id = Integer.parseInt(Idstring);
					
					String nome = JOptionPane.showInputDialog("Digite o nome do funcionário referente ao ID "+ Id + "? ");
					
					String profissao = JOptionPane.showInputDialog("Digite a função do funcionário " + nome +"? ");
					
					String salarioS = JOptionPane.showInputDialog("Digite o salario do funcionário " + nome +"? ");
					float salario = Float.parseFloat(salarioS);
					
					String horasTrabalhoS = JOptionPane.showInputDialog("Quantos horas de trabalho " + nome+ " exerce? ");
					int horasTrabalho = Integer.parseInt(horasTrabalhoS);
					
					String cidade = JOptionPane.showInputDialog("Qual a cidade do funcionário " + nome + "? ");
					
					pStmt.setInt(1, Id);
					pStmt.setString(2, nome);
					pStmt.setString(3, profissao);
					pStmt.setFloat(4, (float) salario);
					pStmt.setInt(5, horasTrabalho);
					pStmt.setString(6, cidade);
					
					cn.commit();
				}
				
				//COMMITANDO
				cn.commit();
				System.out.printf("Foram cadastrados %d funcionarios\n",vezes); //LINHAS ATUALIZADDAS

			}
			
			//CASO NÃO TENHA CADASTRADO NENHUM FUNCIONARIO
			else {
				System.out.println("Nenhum funcionario cadastrado!\n");
				
			}
			
			ResultSet rs = pStmt.executeQuery("SELECT * FROM dados_funcionarios");
			
			//IMPRIMINDO A QUERY
			
			System.out.println("\n--------------FUNCIONARIOS CADASTRADOS NO NOSSO BANCO DE DADOS.-----------------");
			
			//CH --> CARGA HORARIA 
			System.out.println("\nID |	  NOME  |       CARGO    |    SALARIO  |   CH |   CIDADE");
			
			while(rs.next()){
				System.out.println(rs.getInt(1) + "  -  " +
							rs.getString(2) + "  -  " + 
							rs.getString(3) + "  -  " + 
							rs.getFloat(4) + "  -  " + 
					        rs.getInt(5)+ "  -  " + 
							rs.getString(6));
			}
		
			
			cn.commit();
			//FECHANDO A CONEXÃO
			cn.close();
			
			
		}
		
		//CASO RETORNE ALGUM ERRO NA CONEXÃO
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
