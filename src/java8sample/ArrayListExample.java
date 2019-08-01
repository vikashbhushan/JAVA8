package java8sample;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] arg) {

		ArrayList<String> obj = new ArrayList<String>();
		LinkedList<String> linklist = new LinkedList<String>();

		obj.add("hi");
		obj.add("hello");
		obj.add("werwe");
		obj.add("dfsdfsd0");

		System.out.println(obj);
		obj.clear();
		System.out.println(obj);

	}

}
