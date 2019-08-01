package java8sample;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicateString {

	static void findDuplicateWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String[] strArray = str.split(" ");

		for (String tempString : strArray) {

			if (hm.get(tempString) != null) {
				hm.put(tempString, hm.get(tempString) + 1);
			} else {
				hm.put(tempString, 1);
			}
		}

		Iterator<String> tempString = hm.keySet().iterator();
		while (tempString.hasNext()) {
			String temp = tempString.next();
			if (hm.get(temp) > 1) {
				System.out.println("the word " + temp + " apptod " + hm.get(temp) + "no of times");
			}
		}
	}

	static void findDuplicateCharacters(String strch) {
		HashMap<Character, Integer> hmchar = new HashMap<>();
		for (int i = 0; i < strch.length(); i++) {
			char c = strch.charAt(i);
			// hmchar.put(c, 1);
			if (hmchar.get(c) != null) {
				hmchar.put(c, hmchar.get(c) + 1);
			} else {
				hmchar.put(c, 1);
			}
		}
		// System.out.println(hmchar);
		Iterator<Character> tempIterator = hmchar.keySet().iterator();
		while (tempIterator.hasNext()) {
			Character chartemps = tempIterator.next();
			if (hmchar.get(chartemps) > 1) {
				System.out.println("the Character " + chartemps + " apptod " + hmchar.get(chartemps) + "no of times");
			}
		}
	}

	public static void main(String[] args) {

		findDuplicateWord("I am am learning java java");
		findDuplicateCharacters("jajvavihhhhhhhhhhhh");
	}

}
