package day17;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {
	/**
	 *  get input from the keyboard and sort the it to the output
	 *  1. create Scanner object and receives input from keyboard
	 *  2. convert the input string to character arrays.
	 *  3. sort with duplicates reserved and output, because the 
	 *  Charater class has already override the compareTo method,
	 *  so in order to do the task, we need to get our own Comparator
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please input your string here: ");
		String line = sc.nextLine();
		char [] arr = line.toCharArray();
		
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>(){

			@Override
			public int compare(Character s1, Character s2) {
				int num = s1 - s2;
				return num == 0 ? 1 : num;
			}
			
		});
		
		for (char c : arr) {
			ts.add(c);
		}
		
		for (Character ch : ts) {
			System.out.println(ch);
		}
	}

}
