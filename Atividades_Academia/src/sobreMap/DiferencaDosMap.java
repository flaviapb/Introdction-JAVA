package sobreMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DiferencaDosMap {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		
		Map<Integer, Integer> map2 = new LinkedHashMap<Integer, Integer>();
		
		Map<Integer, Integer> map3 = new TreeMap<Integer, Integer>();
		
		
		map1.put(3, 1);
		map1.put(2, 2);
		map1.put(1, 3);
		
		System.out.println("-----------------HashMap---------------------");
		 
		for (Integer key: map1.keySet()) {
			System.out.println("Chave = " + key + " --> Valor = " + map1.get(key));
		}
		
		System.out.println("--------------------------------------\n");
		
		map2.put(3, 1);
		map2.put(2, 2);
		map2.put(1, 3);
		
		System.out.println("----------------LinkedHashMap----------------------");
		 
		for (Integer key: map2.keySet()) {
			System.out.println("Chave = " + key + " --> Valor = " + map2.get(key));
		}
		
		System.out.println("--------------------------------------\n");
		
		map3.put(3, 1);
		map3.put(2, 2);
		map3.put(1, 3);
		
		System.out.println("-------------------TreeMap-------------------");
		 
		for (Integer key: map3.keySet()) {
			System.out.println("Chave = " + key + " --> Valor = " + map3.get(key));
		}
			  
		System.out.println("--------------------------------------");
	}

}
