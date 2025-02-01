package com.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LearnHashMap {

	public static void main(String[] args) {
//		HashMap<Integer, String> h = new HashMap<Integer, String>();
//		h.put(1, "mithun");
//		h.put(2, "raptan");
//		h.put(3, "sazu");
//		h.put(4, "raptan");
//		System.out.println(h);
//		System.out.println(h.containsKey(2));
//		System.out.println(h.containsValue("raptan"));
		
//		for (Entry<Integer, String> entry: h.entrySet()) {
//			System.out.println(entry.getKey() + ":"+ entry.getValue());
//		}
		Map<Integer,String> m = new HashMap<Integer, String>();
		m.put(1, "mithun");
		m.put(2, "sagar");
		m.put(4, "abhijit");
		m.put(3, "pradip");
		m.put(5, null);
		
		//HashMap does not follow the order of insertion
		System.out.println(m); //{1=mithun, 2=sagar, 3=pradip, 4=abhijit, 5=null}
		System.out.println(m.get(2)); //sagar
		System.out.println(m.hashCode()); //1257418333
		System.out.println(m.containsKey(6)); //false
		System.out.println(m.keySet()); //[1, 2, 3, 4, 5]
		System.out.println(m.isEmpty()); //false
		
		System.out.println(m.remove(1)); //mithun 
		System.out.println(m); //{2=sagar, 3=pradip, 4=abhijit, 5=null}
		System.out.println(m.remove(3, "pradip")); //true
		System.out.println(m); //{2=sagar, 4=abhijit, 5=null}
		
		Set<Map.Entry<Integer, String>>  entry = m.entrySet();
		System.out.println(entry); //[2=sagar, 4=abhijit, 5=null]
		
		for (Map.Entry<Integer, String> s : entry) {
			System.out.println(s.getKey() + "-->" + s.getValue());
		}
	}

}
