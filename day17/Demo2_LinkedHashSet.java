package day17;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	/***
	 * 
	 * @param args
	 * LinkedHashSet
	 * is implemented by linked list, is the only one set can be accessed as the stored oreder
	 * hashset can ensure the uniqueness.
	 */

	public static void main(String[] args) {
			
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.add("a");
		lhs.add("b");
		lhs.add("c");
		lhs.add("d");
		System.out.println(lhs);
	}

}
