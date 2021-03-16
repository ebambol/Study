package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map h = new HashMap();
		
		h.put(1, "A");
		System.out.println(h);
		
		h.put(1, "C");
		System.out.println(h);
		
		h.put(2, "D");
		System.out.println(h);
		
		h.remove(1);
		System.out.println(h);
		
		System.out.println(h.get(2));
		
		System.out.println(h.size());
	}

}
