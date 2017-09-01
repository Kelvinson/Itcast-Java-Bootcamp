package day17;

import java.util.HashSet;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("plese input a string:");
		HashSet<Character> hsc = new HashSet<>();
		
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		for (char c : arr) {
			hsc.add(c);
		}
		
		for (char c : hsc) { // Java autoboxes c of type char to Char 
			System.out.println(c);
		}
	}

}
