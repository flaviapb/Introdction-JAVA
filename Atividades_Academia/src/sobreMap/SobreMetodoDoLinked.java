package sobreMap;

import java.util.Map;
import java.util.LinkedHashMap;

public class SobreMetodoDoLinked {

	private static final int MAX = 6;
	public static void main(String[] args) {
		
		Map <Integer, String> lista = new LinkedHashMap<Integer, String>(){
			
		/**
			 * 
			 */
			private static final long serialVersionUID = 9214536420380817261L;

		protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) { //Sintaxe do método 
		               
			return size() > MAX;
		   }
		};
		        
		      
		lista.put(0, "Olá");
		lista.put(1, "Oi");
		lista.put(2, "Bem-Vindo");
		lista.put(3, "Mundo");
		lista.put(4, "Java");
		lista.put(5, "Programação");
			 
		System.out.println("" + lista);
		 
		// Adicionando um novo valor
		lista.put(6, "Códigos");
		 
		// Imprimindo com um novo valor
		System.out.println("" + lista);
		 
		// Adicionando um novo valor
		lista.put(7, "Hello");
		 
		// Imprimindo com um novo valor
		 System.out.println("" + lista);

	}

}
