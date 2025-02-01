package com.finalMock7;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;;


public class MapProgram2 {
		public static void main(String[] args) {
			int []a = {1,1,2,2,2,3,3};
			HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
			for(int i = 0;i<a.length;i++) {
				int key = a[i];
				if(h.containsKey(key)) {
					int value  = h.get(key);
					h.put(key, value+1);
				}
				else {
					h.put(key, 1);
				}
				
				Set<Map.Entry<Integer,Integer>> entrysetValue = h.entrySet();
				for(Map.Entry<Integer, Integer> entry : entrysetValue) {
					int entriesValue = entry.getValue();
					if(entriesValue>1) {
						System.out.println(entry.getKey() + "-->"+entry.getValue());
					}
					}
				
				
			}
			
		}
}
