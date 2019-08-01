package java8sample;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {

	public static void main(String[] args) {
		List name = new ArrayList();

		name.add("vikash");
		name.add("donu");
		name.add("renu");
		name.add("komal");

		name.forEach(System.out::println);

	}

}
