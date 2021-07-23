package sobreMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map; //Importanto a biblioteca MAP

public class EntendendoOMap {

	public static void main(String[] args) {
		
	Map<String,String> map = new HashMap<>();

	map.put("A", "Amanda");
	map.put("B","Bianca");
	map.put("C","Caroline");
	map.put("D","David");
	map.put("E","Emanuel");
	map.put("F","Flávia");
	
	
	for (String key: map.keySet()) {
		System.out.println("Chave = " + key + " --> Valor = " + map.get(key));
	}
	
	System.out.println("--------------------------------------");
	
	Map<String,Integer> map2 = new LinkedHashMap<>();
	
	map2.put("A",10);
	map2.put("B",20);
	map2.put("C",15);
	map2.put("D",30);
	map2.put("E",12);
	map2.put("F",50);
	
	for (String key: map2.keySet()) {
		System.out.println("Chave = " + key + " --> Valor = " + map2.get(key));
	}
	
	}
}
