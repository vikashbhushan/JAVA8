package java8sample;

import java.util.HashMap;
import java.util.Map;

public class NewForLoop {
	
	public static void main(String[] arg) {
	Map<String, Integer> items = new HashMap<>();
	items.put("A", 10);
	items.put("B", 20);
	items.put("C", 30);
	items.put("D", 40);
	items.put("E", 50);
	items.put("F", 60);
	
	items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
	
	items.forEach((k,v)->{
		System.out.println("Item : " + k + " Count : " + v);
		if("E".equals(k)){
			System.out.println("Hello E");
		}
	});

} }
