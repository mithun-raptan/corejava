package com.finalMock7;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class MapProgram1 {
	public static void main(String[] args) {
		int[] a = {1,1,2,2,2,3,3};
		Map<Integer,Integer> m = new HashMap<Integer,Integer>();
		for(int i =0;i<a.length;i++) {
			int key = a[i];
			if(m.containsKey(key)) {
				int value = m.get(key);
				m.put(key, value+1);
			}
			else {
				m.put(key,1);
			}
			
			for(Entry<Integer,Integer> entry : m.entrySet()) {
				System.out.println(entry.getKey()+"-->"+ entry.getValue());
			}
		}
		
	}

}
