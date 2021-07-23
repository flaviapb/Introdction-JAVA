package desafio;

import java.sql.*;
import java.util.ArrayList;


//	This class demonstrates the use of PreparedStatements
public class FormatarParaImpressaoComForEach {

	public static void main(String[] args) {
		
		try{
			String url = "jdbc:mysql://localhost/sakila";
			String user = "root";
			String pass = "Aa74859610aA";
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection successfully established!");
			
			//1 - Create a PreparedStatement with a query "select * from employee where firstname = ?" 
			PreparedStatement pStmt = cn.prepareStatement("Select * from actor where first_name = ?");
			
			//	Change parameter to any keyword desired, if a record
			// 	matches the query then it will be displayed
			
			//2 - Search for John's record
			pStmt.setString(1,"PENELOPE"); //Remember that the data in tables is case sensitive. 
			
			ResultSet rs = pStmt.executeQuery();
					
			//METODO DO PROFESSOR
			/*System.out.println("Printing Query results:");
			while(rs.next()){
				System.out.println(rs.getString(1) + " - " + 
							rs.getString(2) + " - " + 
							rs.getString(3) + " - " + 
							rs.getString(4) + " - " +
					        rs.getDate(4));
			}*/
			
			ArrayList<String> valueMap = new ArrayList<String>();

			while (rs.next()) {
			    String columnAstring = rs.getString(1) + " - " ;
			    String columnBstring = rs.getString(2) + " - " ;
			    String columnCstring = rs.getString(3) + " - " ;
			    String columnDstring = rs.getString(4) + "\n" ;
			   	    
			    valueMap.add(columnAstring);
			    valueMap.add(columnBstring);
			    valueMap.add(columnCstring);
			    valueMap.add(columnDstring);
			    
			}
			
			//ESCOLHA A FORMA DE IMPRESSÃO, BASTA TIRAR O COMENTARIO DE UMA DAS OPÇÕES
			
			valueMap.forEach(n -> System.out.print(n));
			
			//valueMap.stream().forEach(System.out::print); 

			cn.close();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
	}
}
